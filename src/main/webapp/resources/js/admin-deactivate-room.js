$().ready(function () {

    var roomId;
    var btn;
    var dialog;


    $('.activate').change(function () {
        btn = this;
        roomId = getRoomProp(constants.room.properties.id);
        if(this.checked){
            dialog = $('#activateModal');
        }
        else{
            dialog = $('#deactivateModal');
            $('#reasonDeactivate').css('display', 'none');
            verifyRoomBookingState(roomId);
        }

        dialog.modal('show');
    });

    $('#deactivateYesButton').click(function () {
        if($('#reasonDeactivate').valid()){
            var reasonText = $('#reasonText').val();
            changeActiveRoomState(roomId, btn, reasonText);
            dialog.modal('hide');
        }
        
    });

    $('#deactivateNoButton').click(function () {
        $(btn).prop('checked', true);
        dialog.modal('hide');
    });

    $('#activateYesButton').click(function () {
        changeActiveRoomState(roomId, btn);
        dialog.modal('hide');
    });

    function verifyRoomBookingState(roomId) {
        var src = 'adm-edit-room\\warnings';
        var inputData = {id: roomId};
        var warningMessages = [];
        $.ajax({
            url: src,
            data: inputData,
            success: function (data) {
                $('#warningMessages').html('');
                $.each(data, function (index, value) {
                    $('#warningMessages').append('<div class = warningMessage>' + value + '</div>');
                    $('#reasonText').val('');
                    $('#reasonDeactivate').css('display', 'block');
                });
            }
        });
    }

    function changeActiveRoomState(roomId, btn, reason) {
        var src = 'adm-edit-room';
        var inputData = {
            id: roomId,
            reason: reason
        };
        $.ajax({
            url: src,
            dataType: 'json',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(inputData),
            success: function (isActivated) {
                setRoomProp(constants.room.properties.isActive, isActivated);
            }
        });
    }

    function getRoomProp(propIndex) {

        return $(btn).parents('tr').find('td').eq(propIndex).text();
    }

    function setRoomProp(propIndex, prop) {
        $(btn).parents('tr').find('td').eq(propIndex).text(prop);
    }
});

