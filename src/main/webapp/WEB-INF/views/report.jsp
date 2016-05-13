<%@ page isELIgnored="false" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:url value="/j_spring_security_check" var="reportUrl" />
<script src="resources/js/report.js"></script>

    <div class="table">
        <table>
            <caption>
            <h2><spring:message code="report.activeParents" /><span class="smallText"></br>(${dateThen} - ${dateNow})</span></h2>
            </caption>
            <tr>
                <th><spring:message code="report.name" /></th>
                <th><spring:message code="report.surname" /></th>
                <th><spring:message code="report.email" /></th>
                <th><spring:message code="report.phone" /></th>
                <th><spring:message code="report.bookings" /></th>
            </tr>
            <c:forEach var="booking" items="${bookings}">
            <tr>
                <td>${booking.getIdUser().getFirstName()}</td>
                <td>${booking.getIdUser().getLastName()}</td>
                <td>${booking.getIdUser().getEmail()}</td>
                <td>${booking.getIdUser().getPhoneNumber()}</td>
                <td id="${booking.getIdUser().getEmail()}" class="parentRow"><a><spring:message code="report.details" /></a></td>
            </tr>
            </c:forEach>
        </table>
    </div>

    <form action="allParentsBookings">
        <label><h2>Choose start time: <input type="date" value="${dateThen}" name="dateThen" id="dateThenInput"></label></h2>
        <label><h2>Choose end .time: <input type="date" value="${dateNow}" name="dateNow" id="dateNowInput"></label></h2>
        <input class="btn-primary" type="submit" value=<spring:message code="report.generate" />>
    </form>

    <form action="parentbookings" id="parentBookingsForm">
        <input type="hidden" id="parentEmailField" name="parentEmail"/>
        <input type="hidden" id="dateThenField" name="dateThen"/>
        <input type="hidden" id="dateNowField" name="dateNow"/>
    </form>