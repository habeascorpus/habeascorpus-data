import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
applet	TokenNameIdentifier
.	TokenNameDOT
Applet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
BorderLayout	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Button	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Frame	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Label	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Panel	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
event	TokenNameIdentifier
.	TokenNameDOT
ActionEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
event	TokenNameIdentifier
.	TokenNameDOT
ActionListener	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
StringWriter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
Transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
ErrorListener	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
stream	TokenNameIdentifier
.	TokenNameDOT
StreamResult	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
stream	TokenNameIdentifier
.	TokenNameDOT
StreamSource	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
TransformApplet	TokenNameIdentifier
extends	TokenNameextends
Applet	TokenNameIdentifier
{	TokenNameLBRACE
TransformerFactory	TokenNameIdentifier
tf	TokenNameIdentifier
;	TokenNameSEMICOLON
TransformDelegate	TokenNameIdentifier
transformThread	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
MessageFrame	TokenNameIdentifier
extends	TokenNameextends
Frame	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
Frame	TokenNameIdentifier
frame	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ButtonHandler	TokenNameIdentifier
implements	TokenNameimplements
ActionListener	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
actionPerformed	TokenNameIdentifier
(	TokenNameLPAREN
ActionEvent	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
frame	TokenNameIdentifier
.	TokenNameDOT
setVisible	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
MessageFrame	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
title	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
title	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
frame	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
;	TokenNameSEMICOLON
setSize	TokenNameIdentifier
(	TokenNameLPAREN
320	TokenNameIntegerLiteral
,	TokenNameCOMMA
200	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Panel	TokenNameIdentifier
center	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Panel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
center	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Label	TokenNameIdentifier
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Panel	TokenNameIdentifier
bottom	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Panel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Button	TokenNameIdentifier
okButton	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Button	TokenNameIdentifier
(	TokenNameLPAREN
"   OK   "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
okButton	TokenNameIdentifier
.	TokenNameDOT
addActionListener	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
ButtonHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bottom	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
okButton	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
add	TokenNameIdentifier
(	TokenNameLPAREN
center	TokenNameIdentifier
,	TokenNameCOMMA
BorderLayout	TokenNameIdentifier
.	TokenNameDOT
CENTER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
add	TokenNameIdentifier
(	TokenNameLPAREN
bottom	TokenNameIdentifier
,	TokenNameCOMMA
BorderLayout	TokenNameIdentifier
.	TokenNameDOT
SOUTH	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setVisible	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
class	TokenNameclass
AppletErrorListener	TokenNameIdentifier
implements	TokenNameimplements
ErrorListener	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
displayMessage	TokenNameIdentifier
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
MessageFrame	TokenNameIdentifier
z	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
MessageFrame	TokenNameIdentifier
(	TokenNameLPAREN
"XSL transformation alert"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
.	TokenNameDOT
getMessageAndLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
error	TokenNameIdentifier
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
displayMessage	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
fatalError	TokenNameIdentifier
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
displayMessage	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
warning	TokenNameIdentifier
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
displayMessage	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
String	TokenNameIdentifier
transform	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
arg1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
arg2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
stylesheetURL	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
arg1	TokenNameIdentifier
;	TokenNameSEMICOLON
final	TokenNamefinal
String	TokenNameIdentifier
documentURL	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
arg2	TokenNameIdentifier
;	TokenNameSEMICOLON
transformThread	TokenNameIdentifier
.	TokenNameDOT
setStylesheetURL	TokenNameIdentifier
(	TokenNameLPAREN
stylesheetURL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformThread	TokenNameIdentifier
.	TokenNameDOT
setDocumentURL	TokenNameIdentifier
(	TokenNameLPAREN
documentURL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformThread	TokenNameIdentifier
.	TokenNameDOT
setWaiting	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformThread	TokenNameIdentifier
.	TokenNameDOT
wakeUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
wait	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
return	TokenNamereturn
transformThread	TokenNameIdentifier
.	TokenNameDOT
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
transform	TokenNameIdentifier
(	TokenNameLPAREN
getParameter	TokenNameIdentifier
(	TokenNameLPAREN
"stylesheet-name"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
getParameter	TokenNameIdentifier
(	TokenNameLPAREN
"input-document"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
destroy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
transformThread	TokenNameIdentifier
.	TokenNameDOT
destroy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
init	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
tf	TokenNameIdentifier
=	TokenNameEQUAL
TransformerFactory	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
tf	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"use-classpath"	TokenNameStringLiteral
,	TokenNameCOMMA
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
IllegalArgumentException	TokenNameIdentifier
iae	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Could not set XSLTC-specific TransformerFactory"	TokenNameStringLiteral
+	TokenNamePLUS
" attributes.  Transformation failed."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
transformThread	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
TransformDelegate	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Thread	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Thread	TokenNameIdentifier
(	TokenNameLPAREN
transformThread	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"transformThread"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
start	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
transformThread	TokenNameIdentifier
.	TokenNameDOT
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
wakeUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
notifyAll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
class	TokenNameclass
TransformDelegate	TokenNameIdentifier
implements	TokenNameimplements
Runnable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
boolean	TokenNameboolean
isRunning	TokenNameIdentifier
,	TokenNameCOMMA
isWaiting	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
stylesheetURL	TokenNameIdentifier
,	TokenNameCOMMA
documentURL	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
outPut	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
TransformDelegate	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
arg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
isRunning	TokenNameIdentifier
=	TokenNameEQUAL
arg	TokenNameIdentifier
;	TokenNameSEMICOLON
isWaiting	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
isRunning	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
while	TokenNamewhile
(	TokenNameLPAREN
isWaiting	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
wait	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
InterruptedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
transform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
isWaiting	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
TransformApplet	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
wakeUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setStylesheetURL	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
arg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
stylesheetURL	TokenNameIdentifier
=	TokenNameEQUAL
arg	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setDocumentURL	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
arg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
documentURL	TokenNameIdentifier
=	TokenNameEQUAL
arg	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getStylesheetURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
stylesheetURL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getDocumentURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
documentURL	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setWaiting	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
arg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
isWaiting	TokenNameIdentifier
=	TokenNameEQUAL
arg	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
destroy	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
isRunning	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
wakeUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
notifyAll	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getOutput	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
outPut	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
transform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
xslURL	TokenNameIdentifier
=	TokenNameEQUAL
getStylesheetURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
docURL	TokenNameIdentifier
=	TokenNameEQUAL
getDocumentURL	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StringWriter	TokenNameIdentifier
sout	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringWriter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
PrintWriter	TokenNameIdentifier
out	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
PrintWriter	TokenNameIdentifier
(	TokenNameLPAREN
sout	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
xslURL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
docURL	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"<h1>Transformation error</h1>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"The parameters <b><tt>stylesheetURL</tt></b> "	TokenNameStringLiteral
+	TokenNamePLUS
"and <b><tt>source</tt></b> must be specified"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
Transformer	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
tf	TokenNameIdentifier
.	TokenNameDOT
newTransformer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StreamSource	TokenNameIdentifier
(	TokenNameLPAREN
xslURL	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
setErrorListener	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
AppletErrorListener	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
long	TokenNamelong
start	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
t	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StreamSource	TokenNameIdentifier
(	TokenNameLPAREN
docURL	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
StreamResult	TokenNameIdentifier
(	TokenNameLPAREN
out	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
long	TokenNamelong
done	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
currentTimeMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
start	TokenNameIdentifier
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"<!-- transformed by XSLTC in "	TokenNameStringLiteral
+	TokenNamePLUS
done	TokenNameIdentifier
+	TokenNamePLUS
"msecs -->"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
out	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Transformation complete!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
sout	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outPut	TokenNameIdentifier
=	TokenNameEQUAL
sout	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sout	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
RuntimeException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"<h1>RTE</h1>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outPut	TokenNameIdentifier
=	TokenNameEQUAL
sout	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"<h1>exception</h1>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
out	TokenNameIdentifier
.	TokenNameDOT
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outPut	TokenNameIdentifier
=	TokenNameEQUAL
sout	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
