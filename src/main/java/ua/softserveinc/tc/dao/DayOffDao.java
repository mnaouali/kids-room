package ua.softserveinc.tc.dao;

import ua.softserveinc.tc.entity.DayOff;

import java.time.LocalDate;
import java.util.List;

public interface DayOffDao extends BaseDao<DayOff>  {

    void delete(long id);

}
