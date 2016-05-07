package ua.softserveinc.tc.service;

import org.springframework.beans.factory.annotation.Autowired;

import ua.softserveinc.tc.dao.ChildDao;
import ua.softserveinc.tc.entity.Child;
import ua.softserveinc.tc.entity.ColumnConstants.ChildConst;
import ua.softserveinc.tc.entity.User;

import java.util.List;

/**
 * Created by Nestor on 07.05.2016.
 */

public class ChildServiceImpl extends BaseServiceImpl<Child> implements ChildService {
    @Autowired
    private ChildDao childDao;

    @SuppressWarnings("unchecked")
    public List<Child> getChildrenByUserId(User user){
        return childDao
                .getEntityManager()
                .createQuery("SELECT * FROM " + ChildConst.TABLE_NAME_CHILD +
                        " WHERE " + ChildConst.ID_PARENT + " = " + user.getId() + ";")
                .getResultList();
    }
}