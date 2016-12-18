package ua.softserveinc.tc.controller.util;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ua.softserveinc.tc.constants.UserConstants;
import ua.softserveinc.tc.constants.EventConstants;
import ua.softserveinc.tc.constants.ChildConstants;
import ua.softserveinc.tc.constants.AdminConstants;
import ua.softserveinc.tc.constants.ValidationConstants;
import ua.softserveinc.tc.dto.EventDto;
import ua.softserveinc.tc.dto.MonthlyEventDto;
import ua.softserveinc.tc.dto.RecurrentEventDto;
import ua.softserveinc.tc.entity.Event;
import ua.softserveinc.tc.entity.User;
import ua.softserveinc.tc.mapper.GenericMapper;
import ua.softserveinc.tc.service.CalendarService;
import ua.softserveinc.tc.service.RoomService;
import ua.softserveinc.tc.service.UserService;
import ua.softserveinc.tc.validator.EventValidator;

import java.security.Principal;

@Controller
public class ViewEventController {

    @Autowired
    GenericMapper<Event, EventDto> genericMapper;

    @Autowired
    private CalendarService calendarService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private EventValidator eventValidator;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public final String viewHome(Model model, Principal principal) {

        if (principal == null) {
            return "entrypoint";
        }
        String email = principal.getName();
        User user = userService.getUserByEmail(email);

        switch (user.getRole()) {
            case USER:
                model.addAttribute(UserConstants.Entity.ROOMS, roomService.getTodayActiveRooms());
                model.addAttribute(UserConstants.Entity.KIDS, userService.getEnabledChildren(user));
                model.addAttribute(UserConstants.Entity.USERID, user.getId());
                if(user.getChildren().isEmpty() || userService.getEnabledChildren(user).isEmpty()) {
                    return ChildConstants.View.MY_KIDS;
                }
                return EventConstants.View.MAIN_PAGE;
            case MANAGER:
                model.addAttribute(UserConstants.Entity.ROOMS, userService.getActiveRooms(user));
                return EventConstants.View.MAIN_PAGE;
            default:
                model.addAttribute(AdminConstants.ROOM_LIST, roomService.findAll());
                return AdminConstants.EDIT_ROOM;
        }
    }


    @GetMapping(value = "getevents/{id}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getEvents(@PathVariable int id) {
        return new Gson().toJson(calendarService.findEventByRoomId(id));
    }


    @PostMapping(value = "getnewevent", produces = "application/json")
    @ResponseBody
    public ResponseEntity<String> getAjax(@RequestBody EventDto eventDto, BindingResult bindingResult) {
        eventValidator.validate(eventDto, bindingResult);
        if (eventValidator.isSingleValid(eventDto)) {
            if (bindingResult.hasErrors()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                        bindingResult.getFieldError().getCode());
            } else {
                calendarService.create(genericMapper.toEntity(eventDto));
                return ResponseEntity.status(HttpStatus.OK).body(new Gson().toJson(eventDto));
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    ValidationConstants.EVENT_START_NOT_EQUALS_END_MSG);
        }
    }

    @PostMapping("geteventforupdate")
    @ResponseBody
    public ResponseEntity<String> getEventForUpdate(@RequestBody EventDto eventDto,
                                                    BindingResult bindingResult) {
        eventValidator.validate(eventDto, bindingResult);
        if (eventValidator.isSingleValid(eventDto)) {
            if (bindingResult.hasErrors()) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                        bindingResult.getFieldError().getCode());
            } else {
                calendarService.updateEvent(genericMapper.toEntity(eventDto));
                return ResponseEntity.status(HttpStatus.OK).body(new Gson().toJson(eventDto));
            }
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
                    ValidationConstants.EVENT_START_NOT_EQUALS_END_MSG);
        }
    }

    @PostMapping("geteventfordelete")
    @ResponseStatus(HttpStatus.OK)
    public void getEventForDelete(@RequestBody EventDto eventDto) {
        calendarService.deleteEvent(genericMapper.toEntity(eventDto));
    }

    @PostMapping(value = "getrecurrentevents", produces = "application/json")
    @ResponseBody
    public String gerRecurrent(@RequestBody RecurrentEventDto recurrentEventDto, BindingResult bindingResult) {
        eventValidator.validate(recurrentEventDto, bindingResult);
        if (eventValidator.isReccurrentValid(recurrentEventDto)) {
            if (bindingResult.hasErrors()) {
                return bindingResult.getFieldError().getCode();
            } else {
                return new Gson().toJson(calendarService.createRecurrentEvents(recurrentEventDto));
            }
        } else {
            return ValidationConstants.EVENT_RECCURRENT_END_MUST_BIGER_ONE_DAY_MSG;
        }
    }

    @PostMapping(value = "getmonthlyevents", produces = "application/json")
    @ResponseBody
    public String getMonthly(@RequestBody MonthlyEventDto monthlyEventDto) {
        return new Gson().toJson(calendarService.createMonthlyEvents(monthlyEventDto));
    }

    @GetMapping(value = "getroomproperty/{id}", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getRoomProperty(@PathVariable long id) {
        return calendarService.getRoomWorkingHours(id) + " " + calendarService.getRoomCapacity(id);
    }


    @GetMapping(value = "getRecurrentEventForEditing/{recurrentEventId}",
                produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String getRecurrentBookingForEditing(@PathVariable  Long recurrentEventId) {
        return new Gson().toJson(calendarService.getRecurrentEventForEditingById(recurrentEventId));
    }

}
