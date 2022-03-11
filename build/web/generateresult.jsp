<%
    String q1 = request.getParameter("optradio1");
    String q2 = request.getParameter("optradio2");
    String q3 = request.getParameter("optradio3");
    String q4 = request.getParameter("optradio4");
    String q5 = request.getParameter("optradio5");
    String q6 = request.getParameter("optradio6");
    String q7 = request.getParameter("optradio7");
    String q8 = request.getParameter("optradio8");
    String q9 = request.getParameter("optradio9");
    String q10 = request.getParameter("optradio10");
    
    int  cont1=0; int  cont2=0; int  cont3=0; int  cont4=0; 
    int  cont5=0; int  cont6=0; int  cont7=0; 
    int  cont8=0; int  cont9=0; int  cont10=0; 
    if(q1.equals("Nanosecond")){cont1++;}else {cont1 = cont1+0;}
    if(q2.equals("Fixed")){cont2++;}else {cont2 = cont2+0;}
    if(q3.equals("CPUandRAM")){cont3++;}else {cont3 = cont3+0;}
    if(q4.equals("CompactDiscReadOnlyMemory")){cont4++;}else {cont4 = cont4+0;}
    if(q5.equals("Volatilememory")){cont5++;}else {cont5 = cont5+0;}
    if(q6.equals("CacheMemory")){cont6++;}else {cont6 = cont6+0;}
    if(q7.equals("Firmware")){cont7++;}else {cont7 = cont7+0;}
    if(q8.equals("3")){cont8++;}else {cont8 = cont8+0;}
    if(q9.equals("Alltheabovefunctions")){cont9++;}else {cont9 = cont9+0;}
    if(q10.equals("6bits")){cont10++;}else {cont10 = cont10+0;}
    int sum = cont1+cont2+cont3+cont4+cont5+cont6+cont7+cont8+cont9+cont10;
    System.out.println(sum);
    
%>