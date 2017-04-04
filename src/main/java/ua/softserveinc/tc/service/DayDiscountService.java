package ua.softserveinc.tc.service;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import ua.softserveinc.tc.dto.DayDiscountDTO;
import ua.softserveinc.tc.entity.DayDiscount;
import ua.softserveinc.tc.entity.pagination.DataTableOutput;
import ua.softserveinc.tc.entity.pagination.SortingPagination;

public interface DayDiscountService extends BaseService<DayDiscount> {

  List<DayDiscountDTO> findAllDailyDiscounts();

  void addNewDayDiscount(DayDiscountDTO dto);

  DayDiscountDTO findDayDiscountById(long id);

  void updateDayDiscountById(DayDiscountDTO dto);

  List<DayDiscountDTO> getDayDiscountsForPeriod(LocalDate startDate, LocalDate endDate,
      LocalTime startTime, LocalTime endTime);

  DataTableOutput<DayDiscountDTO> paginateDayDiscount(SortingPagination sortPaginate);
}