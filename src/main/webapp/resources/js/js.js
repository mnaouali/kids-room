$(document).ready(function() {
    $('#confirm').blur(function(){
        var p1 = $('#password').val();
        var p2 = $('#confirm').val();
        if(p1!=p2){
            $('#validPassword').text('This password does not match with the password in "Password" field. Please enter the same password');
            $('button').prop('disabled', true);
        }else{
            $('#validPassword').empty();
            $('button').prop('disabled', false);
    }});

    $('#email').blur(function(){
        var p = $('#email').val();
        if(p.indexOf('@softserveinc.com') ==-1) {
            $('#validEmail').text('Please enter your email with "softserveinc.com" domain');
            $('button').prop('disabled', true);
        }else{
            $('#validEmail').empty();
            $('button').prop('disabled', false);
        }
    });
});