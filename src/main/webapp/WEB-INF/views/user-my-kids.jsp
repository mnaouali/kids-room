<%@ page isELIgnored="false" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<c:url value="/j_spring_security_check" var="myKidsUrl" />

<%@ page import="ua.softserveinc.tc.constants.ModelConstants.MyKidsConst" %>

<link rel='stylesheet' href='resources/css/mykidslist.css'>

<script src="resources/js/mykidslist.js">
</script>


<div class="list" modelAttribute="<%=MyKidsConst.MY_KIDS_LIST_ATTRIBUTE %>">
<h2>
    <spring:message code="kid.list" />
</h2>

<c:if test="${kids.isEmpty()}">
      <h3><spring:message code="kids.listNONE" /></h3>
</c:if>
<c:if test="${!kids.isEmpty()}">
<c:forEach var="kid" items="${kids}">
<div data-id="${kid.getId()}" class="kidslistblock">
    <div class="kidslistitem">
    <div class="thumb">
    <img id="picture" alt="Profile picture" src="images?kidId=${kid.id}" width="100" height="100" />
    </div>
    <h3>${kid.getFullName()}</h3>
    </div>

</div>
</c:forEach>
</c:if>


<form action="registerkid">
    <button class="btn btn-raised btn-primary waves-effect waves-light" type="submit">
        <spring:message code="button.add" />
    </button>
</form>
</div>

