 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/testing.css" rel="stylesheet" type="text/css" />
 <!-- Insert to your webpage before the </head> -->
   
        <title>Store Account</title>

 

 
 <script type="text/javascript">
    window.history.forward();
    function noBack() { window.history.forward(); }
</script> 
 <script src="Datepopulation.js"></script> 
<script type="text/javascript">

		$(function() {
			$("#dialog").dialog({
				autoOpen: false,
				modal: true,
				width: 800,
				height: 600,
				 
			});
			$(".dialogify").on("click", function(e) {
				e.preventDefault();
				$("#dialog").html("");
				$("#dialog").dialog("option", "title","User Profile Update").dialog("open");
		
				$("#dialog").load(this.href, function() {
					//alert("trying to load this.href") ; 
				});
			});
		});
	</script>
	
	 <script type="text/javascript">

	 
		$(function() {
			$("#dialog1").dialog({
				autoOpen: false,
				modal: true,
				width: 544,
				height: 500,
				 
			});
			$(".dialogify1").on("click", function(e) {
				e.preventDefault();
				$("#dialog1").html("");
				$("#dialog1").dialog("option", "title","Update Gas Items").dialog("open");
		
				$("#dialog1").load(this.href, function() {
					//alert("trying to load this.href") ; 
				});
			});
			
			$("#dialog1d").dialog({
				autoOpen: false,
				modal: true,
				width:480,
				height:520,
				 
			});
			$(".dialogify1d").on("click", function(e) {
				e.preventDefault();
				$("#dialog1d").html("");
				$("#dialog1d").dialog("option", "title","Update Gas Items").dialog("open");
		
				$("#dialog1d").load(this.href, function() {
					//alert("trying to load this.href") ; 
				});
			});
			
		});
	</script>
	

	



  
</head>

<body>


<div>
<c:if test="${gasinventoryreport_listsize gt 0 }">
<table width="100%" border="0" align="center" cellspacing="0" cellpadding="0" >
<tr>
<td>&nbsp;</td>
</tr>
</table>
 </c:if>
</div>
<c:choose>
<c:when test="${gasinventoryreport_listsize gt 0 }">
<div id="gsr"> 
 
 <table width="1100" border="0" align="left" cellspacing="0" cellpadding="0" style="margin-bottom: 100px" > 
  <tr>
  <td colspan="100%">
 <table width="120%" border="0" align="center" cellspacing="0" cellpadding="0" class="table_collapse1">
  <tr> 
       <td class="fontstyle th-report" align="left"    >
    <a   href="gas_inventory.jsp" class="myButton122" style="margin-left: 8px;margin-right: 8px;">Total</a> 
    <c:forEach items="${gas_item_names_list }"  var="v" > 
       <a   onclick="retrieve('${v.itemname }','${v.item_id }')" class="myButton11" style="margin-left: 8px;margin-right: 8px;" > ${v.itemname } </a>
    </c:forEach>  
</td><th style="text-align: left;"> 
       <span style="font-size:16px;">${reportlocationname } Gas Inventory Report</span></th>
    </tr></table></td></tr>

<tr><td>
<div id="example"  >
<table id="testTable" width="120%" border="1" cellspacing="0" cellpadding="0" style="border-top:none;border-bottom:1px solid #000;"  class="table_collapse_gas_total">

  <tr class="txt-indnt " style="background-color: #779BCC">
   
    <td class="table-tab" style="height: 30px" width="150px" colspan="2">&nbsp;</td> 
    <td class="table-tab" colspan="11" align="center" >&nbsp;Total</td>
    
        <%-- <c:forEach begin="0" end="${itemnamecount-1 }" items="${gasreport }"  var="v" >
    <td class="table-tab" colspan="11" align="center" >&nbsp;${v.itemname }</td>
     </c:forEach> --%>  
    </tr>
  <tr class="txt-indnt ">
   <td class="table_color100" width="150px">&nbsp;</td>
    <td class="table_color100" width="150px">&nbsp;</td> 
    
        <td class="table_color100" width="150px"></td>
        <td class="table_color100" width="150px"><span class="font-family"> </span></td>

    <td colspan="3" align="center" class="table_color100"  	>&nbsp;Sale</td>
    
    <td class="table_color100"  colspan="3" align="center"><span class="font-family">Purchase</span></td>
  
    <td class="table_color100" width="150px">&nbsp;</td>
    <td class="table_color100" width="150px">&nbsp;</td>
    <td class="table_color100" width="150px">&nbsp;</td> 
 
   
    <%-- <c:forEach begin="1" end="${itemnamecount }" varStatus="status">
        <td class="table_color100" width="150px">&nbsp; 
 
        </td>
        <td class="table_color100" width="150px"><span class="font-family"> </span></td>

      <td colspan="3" align="center" class="table_color100"  	>&nbsp;Sale</td>
    
    <td class="table_color100"  colspan="3" align="center"><span class="font-family">Purchase</span></td>
  
    <td class="table_color100" width="150px">&nbsp;</td>
    <td class="table_color100" width="150px">&nbsp;</td>
    <td class="table_color100" width="150px">&nbsp;</td>
    	
    </c:forEach> --%>

  
  </tr>
 
  <tr class="txt-indnt ">
    <td class="table_color1"><span class="font-family">Invoice No</span></td>
    <td class="table_color1"><span class="font-family">
    <c:choose>
   
     <c:when test="${selectdtype eq 'Weekly' }"><span class="font-family">Week</span></c:when>
      <c:when test="${selectdtype eq 'Monthly' }"><span class="font-family">Month</span></c:when>
      <c:otherwise> <span class="font-family">Date</span> </c:otherwise>
    </c:choose>
    </span></td>
    <td class="table_color1" width="150px">&nbsp;</td>
           
        <td class="table_color1"><span class="font-family">Open/Balance</span></td> 

    <td class="table_color1" width="150px"><span class="font-family">Gallons</span></td>
    <td class="table_color1" width="150px"><span class="font-family">Rate</span></td>
    <td class="table_color1" width="150px" ><span class="font-family">Gas Amount</span></td>
    <td class="table_color1" width="150px" ><span class="font-family">Gallons</span></td>
    <td class="table_color1" width="150px"><span class="font-family">Rate</span></td>
    <td class="table_color1" width="150px"><span class="font-family">Amount</span></td>
    
     <td class="table_color1"><span class="font-family">Closing Balance</span></td>
    <td class="table_color1"><span class="font-family">Electronic</span></td>
    
    <td class="table_color1"  ><span class="font-family">Difference</span></td>  
    
       <!-- <td class="table_color1" width="150px">&nbsp;</td> -->
           <%-- <c:forEach begin="1" end="${itemnamecount }" varStatus="status">
        <td class="table_color1"><span class="font-family">Open/Balance</span></td> 

    <td class="table_color1" width="150px"><span class="font-family">Gallons</span></td>
    <td class="table_color1" width="150px"><span class="font-family">Rate</span></td>
    <td class="table_color1" width="150px"><span class="font-family">Gas Amount</span></td>
    <td class="table_color1" width="150px"><span class="font-family">Gallons</span></td>
    <td class="table_color1" width="150px"><span class="font-family">Rate</span></td>
    <td class="table_color1" width="150px"><span class="font-family">Amount</span></td>
    
     <td class="table_color1"><span class="font-family">Closing Balance</span></td>
    <td class="table_color1"><span class="font-family">Electronic</span></td>
    
    <td class="table_color1"  ><span class="font-family">Difference</span></td>
    
    <c:if test="${status.index ne itemnamecount }">
        <td class="table_color1"><span class="font-family"> </span></td></c:if>
    </c:forEach>  --%>
    
  </tr>
   
   <tr>
    <td class="text_border129" >&nbsp;</td>
   <td class="text_border129">&nbsp;</td>
   
   
    <td class="table_color1"><span class="font-family" style="font-size:14px;text-align: right;"><i>&nbsp;Total</i></span></td> 
    <td class="text_border129"><span class="font-family"><fmt:formatNumber type="number" minFractionDigits="3" maxFractionDigits="3" value="${total_openingbalance }" /></span></td>
    <td class="text_border129"><span class="font-family"><fmt:formatNumber type="number" minFractionDigits="3" maxFractionDigits="3" value="${totalsold_gallons }" />  </span></td>
    <td class="text_border129"><span class="font-family"> <fmt:formatNumber var ="totalavrge" value="${totalsold_amount/totalsold_gallons }" pattern="0.00"></fmt:formatNumber>
      <c:choose>
      <c:when test="${totalsold_amount  eq '0.00' }">0.00</c:when>
      <c:otherwise>  ${totalavrge }</c:otherwise>
      </c:choose>
      
      </span></td>
    <td class="text_border129"><span class="font-family"><fmt:formatNumber type="number" minFractionDigits="3" maxFractionDigits="3" value="${totalsold_amount }" /></span></td>
    <td class="text_border129"><span class="font-family"><fmt:formatNumber type="number" minFractionDigits="3" maxFractionDigits="3" value="${totaldelivered_gallons }" /></span></td>
    <td class="text_border129"><span class="font-family">  
    <fmt:formatNumber var ="totalavrge" value="${totaldelivered_amount/totaldelivered_gallons }" pattern="0.00"></fmt:formatNumber> 
     <c:choose>
      <c:when test="${totaldelivered_amount  eq '0.00' }">0.00</c:when>
      <c:otherwise>  ${totalavrge }</c:otherwise>
      </c:choose>
      </span></td> 
         <td class="text_border129"><span class="font-family"><fmt:formatNumber type="number" minFractionDigits="3" maxFractionDigits="3" value="${totaldelivered_amount }" /></span></td>
     <td class="text_border129"><span class="font-family"><fmt:formatNumber type="number" minFractionDigits="3" maxFractionDigits="3" value="${totalclosing_balance }" /></span></td>
     <td class="text_border129"><span class="font-family"><fmt:formatNumber type="number" minFractionDigits="3" maxFractionDigits="3" value="${totaletramount }" /></span></td>
      <td class="text_border129"   ><span class="font-family"><fmt:formatNumber type="number" minFractionDigits="3" maxFractionDigits="3" value="${totaldiffamount }" /></span></td>
       
   
        <%-- <c:forEach items="${individualtotals }" var="t"  >
      
        <td class="table_color1"><span class="font-family"><i>&nbsp;Total</i></span></td> 
    <td class="text_border329"><span class="font-family">${t.opening_balance_total }  </span></td> 
    <td class="text_border329"><span class="font-family">${t.sold_gallons_total }</span></td>  
    <td class="text_border129"><span class="font-family"><fmt:formatNumber var ="totalavrge" value="${t.sold_amount_total /t.sold_gallons_total }" pattern="0.00"></fmt:formatNumber>  
    <c:choose>
      <c:when test="${t.sold_amount_total  eq '0.00' }">0.00</c:when>
      <c:otherwise>  ${totalavrge }</c:otherwise>
      </c:choose>
      </span></td>
    <td class="text_border329"><span class="font-family">${t.sold_amount_total }</span></td>
    <td class="text_border329"><span class="font-family">${t.delivered_gallons_total }</span></td>
    <td class="text_border329"><span class="font-family">
      <fmt:formatNumber var ="totalavrge" value="${t.delivered_amount_total /t.delivered_gallons_total }" pattern="0.00"></fmt:formatNumber> 
      <c:choose>
      <c:when test="${t.delivered_amount_total  eq '0.00' }">0.00</c:when>
      <c:otherwise>  ${totalavrge }</c:otherwise>
      </c:choose>
    </span></td>
    <td class="text_border329"><span class="font-family">${t.delivered_amount_total }</span></td> 
             <td class="text_border129"><span class="font-family">${t.closing_balance_total }</span></td>
     <td class="text_border129"><span class="font-family"> </span></td>
     <td class="text_border129"><span class="font-family">  </span></td> 
    
     </c:forEach> --%>
  
         
</tr>
 
 
 <c:forEach items="${gasinventoryreport_list }" var="v" varStatus="status"> 

<tr class="txt-indnt"> 

    <td class="text_border_total"><span class="font-family">
    
    <c:choose>
    <c:when test="${role eq 'Admin' }">  <c:choose>
    <c:when test="${v.purchasestatus eq 'Enable' }">
    <c:choose>
    <c:when test="${v.reportdate le store_lock_date }">
    	<a href="#" onclick="LockMsg()">Edit  </a>
    </c:when>
    <c:otherwise>
    	<a href="DisplayGasEditServlet?reportdate=${v.reportdate }"  class="dialogify1" >Edit  </a>
    </c:otherwise>
    </c:choose> 
    </c:when>
    <c:otherwise>
    <c:choose>
    <c:when test="${v.reportdate le store_lock_date }">
    	<a href="#" onclick="LockMsg()">Edit  </a>
    </c:when>
    <c:otherwise>
    	<a href="DisplayGasEditServlet?reportdate=${v.reportdate }"  class="dialogify1d" >Edit  </a>
    </c:otherwise>
    </c:choose> 
    
    </c:otherwise>
    </c:choose>  </c:when>
        <c:when test="${role ne 'Admin' }"> 
        <c:choose>
        <c:when test="${v.lock eq 'y' }"><a  onclick="Mes()"   >Edit  </a> </c:when>
        <c:when test="${v.lock ne 'y' }">
         <c:choose>
    <c:when test="${v.purchasestatus eq 'Enable' }">
    <c:choose>
    <c:when test="${v.reportdate le store_lock_date }">
    	<a href="#" onclick="LockMsg()">Edit  </a>
    </c:when>
    <c:otherwise>
    	<a href="DisplayGasEditServlet?reportdate=${v.reportdate }"  class="dialogify1" >Edit  </a>
    </c:otherwise>
    </c:choose>
     
    </c:when>
    <c:otherwise> 
    <c:choose>
    <c:when test="${v.reportdate le store_lock_date }">
    	<a href="#" onclick="LockMsg()">Edit  </a>
    </c:when>
    <c:otherwise>
    	<a href="DisplayGasEditServlet?reportdate=${v.reportdate }"  class="dialogify1d" >Edit  </a>
    </c:otherwise>
    </c:choose>
    
    </c:otherwise>
      </c:choose></c:when> 
        </c:choose>
           </c:when> 
    </c:choose>
    
</span></td>

    <td class="txt-indnt text_border_total" ><span class="font-family">
       <c:choose> 
     <c:when test="${selectdtype eq 'Weekly' }"><span class="font-family">${v.reportdate }</span></c:when>
      <c:when test="${selectdtype eq 'Monthly' }"><span class="font-family">${v.reportdate }</span></c:when>
      <c:otherwise> <a href="GetDateServlet?pagename=gas.jsp&inputField=${v.reportdate }&locationid=${locationrriddd }&gotoreport=gas_inventory.jsp&pagefrom=gas_inventory.jsp">${v.reportdate }&nbsp;</a>  </c:otherwise>
    </c:choose> 
     </span>
     </td>
     
        <td class="table_color1"><span class="font-family"><i>&nbsp;Total</i></span></td> 
     <td class="text_border329"><span class="font-family">${v.opening_balance }</span></td>
 	 <td class="text_border329"><span class="font-family">${v.sold_gallons }</span></td>
 	 <td class="text_border129"><span class="font-family">${v.sold_average }</span></td>
 	 <td class="text_border329"><span class="font-family">${v.sold_amount }</span></td>
 	 <td class="text_border329"><span class="font-family" <c:if test="${(v.delivered_gallons ne '0.000' and v.delivered_amount eq '0.00') or (v.delivered_gallons ne '0.00' and v.delivered_amount eq '0.000')}">style='color:red'</c:if>>${v.delivered_gallons }</span></td>
 	 <td class="text_border129"><span class="font-family" <c:if test="${(v.delivered_gallons ne '0.000' and v.delivered_amount eq '0.00') or (v.delivered_gallons ne '0.00' and v.delivered_amount eq '0.000')}">style='color:red'</c:if>>${v.delivered_average }</span></td>
 	 <td class="text_border329"><span class="font-family" <c:if test="${(v.delivered_gallons ne '0.000' and v.delivered_amount eq '0.00') or (v.delivered_gallons ne '0.00' and v.delivered_amount eq '0.000')}">style='color:red'</c:if>>${v.delivered_amount }</span></td>
 	 <td class="text_border129"><span class="font-family">${v.closing_balance }</span></td>
 	 <td class="text_border129"><span class="font-family">${v.etr }</span></td>
 	 <td class="text_border129"><span class="font-family">${v.diff }</span></td> 
   
   </tr>
  </c:forEach>
</table></div> </td></tr></table>
  </div>
  
  
  
   </c:when>
<c:otherwise>
 <center><span style="color:red"> No Data available   </span></center></c:otherwise>
</c:choose>



<br></br>
<br></br>


</body>
</html>