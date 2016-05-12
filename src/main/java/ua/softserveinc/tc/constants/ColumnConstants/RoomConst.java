package ua.softserveinc.tc.constants.ColumnConstants;

/**
 * Created by Chak on 05.05.2016.
 */
public interface RoomConst {

    String TABLE_NAME_ROOMS = "rooms";

    String ID_ROOM = "id_room";

    String NAME_ROOM = "name_room";

    String ADDRESS_ROOM = "address_room";

    String PHONE_ROOM = "phone_room";

    String CAPACITY_ROOM = "capacity_room";

    String PRICING = "pricing";

    // Don't need ID_MANAGER & ID_CITY.
    // Becose we will get this constants from appropriate tables from relationship.

}