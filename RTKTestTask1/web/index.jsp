<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="org.json.*" %>
<%JSONArray states = null;
  if(request.getAttribute("states") != null) {
    states = (JSONArray) request.getAttribute("states");
  }
%>
<html>
<head>
  <title>SimpleTask</title>
  <link rel="icon" href="favicon.png">
  <link rel="stylesheet" href="style.css">
</head>
<body>
<table>
  <%if(states != null) {
    for(int i = 0; i < states.length(); i++) {
      JSONObject obj = null;
      try {
        obj = (JSONObject) states.get(i);

  %>
  <tr>
    <td><div><%=obj.get("short_name")%></div></td>
    <td><div><%=obj.get("name")%></div></td>
  </tr>
  <%
        } catch (JSONException e) {
          e.printStackTrace();
      }
    }
  }%>
</table>
</body>
</html>