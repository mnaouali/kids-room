package ua.softserveinc.tc.service;

import ua.softserveinc.tc.entity.Booking;
import ua.softserveinc.tc.entity.Child;
import ua.softserveinc.tc.entity.User;

import java.util.List;

/**
 * Created by Nestor on 07.05.2016.
 */

public interface ChildService extends BaseService<Child> {
    List<Child> getChildrenByUser(User user);
    List<Child> getAllChildren();
   // List<Child> getBookedChildren();
}