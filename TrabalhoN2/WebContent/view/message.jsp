 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
	<c:if test="${msg.isExistMessage()}">
		
		<c:choose>
			<c:when test="${!msg.isSucesso()}">
			   <div class="alert alert-danger" role="alert">${msg.getMsg()} 
				    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
				    	<span aria-hidden="true">&times;</span>
				    </button>
				</div>
			</c:when>
	
	
			<c:otherwise>
	                    <div class="alert alert-success" role="alert">${msg.getMsg()} 
				    <button type="button" class="close" data-dismiss="alert" aria-label="Close">
				    	<span aria-hidden="true">&times;</span>
				    </button>
				</div>
	         </c:otherwise>
	
		
	
		</c:choose>
		
		
	</c:if>

	
		