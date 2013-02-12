package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
gui	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Color	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Image	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
Toolkit	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
awt	TokenNameIdentifier
.	TokenNameDOT
BorderLayout	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
StyledDocument	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
SimpleAttributeSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
MutableAttributeSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
swing	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
StyleConstants	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
StringTokenizer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Enumeration	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LogTextPanel	TokenNameIdentifier
extends	TokenNameextends
JPanel	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
JScrollBar	TokenNameIdentifier
scrollBar	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
JTextPane	TokenNameIdentifier
textPane	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
JCheckBox	TokenNameIdentifier
cbxTail	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
StyledDocument	TokenNameIdentifier
doc	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Hashtable	TokenNameIdentifier
fontAttributes	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
eventBufferMaxSize	TokenNameIdentifier
=	TokenNameEQUAL
10000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
ArrayList	TokenNameIdentifier
eventBuffer	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
eventBufferMaxSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
eventViewIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
LogTextPanel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
constructComponents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
createDefaultFontAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
constructComponents	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
setLayout	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
BorderLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cbxTail	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JCheckBox	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cbxTail	TokenNameIdentifier
.	TokenNameDOT
setSelected	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cbxTail	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
"Tail log events"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
JPanel	TokenNameIdentifier
bottomPanel	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JPanel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bottomPanel	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
cbxTail	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
textPane	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JTextPane	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
textPane	TokenNameIdentifier
.	TokenNameDOT
setEditable	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
textPane	TokenNameIdentifier
.	TokenNameDOT
setText	TokenNameIdentifier
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
doc	TokenNameIdentifier
=	TokenNameEQUAL
textPane	TokenNameIdentifier
.	TokenNameDOT
getStyledDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
scrollBar	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
JScrollBar	TokenNameIdentifier
(	TokenNameLPAREN
JScrollBar	TokenNameIdentifier
.	TokenNameDOT
VERTICAL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
bottomPanel	TokenNameIdentifier
,	TokenNameCOMMA
BorderLayout	TokenNameIdentifier
.	TokenNameDOT
SOUTH	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
scrollBar	TokenNameIdentifier
,	TokenNameCOMMA
BorderLayout	TokenNameIdentifier
.	TokenNameDOT
EAST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
textPane	TokenNameIdentifier
,	TokenNameCOMMA
BorderLayout	TokenNameIdentifier
.	TokenNameDOT
CENTER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTextBackground	TokenNameIdentifier
(	TokenNameLPAREN
Color	TokenNameIdentifier
color	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
textPane	TokenNameIdentifier
.	TokenNameDOT
setBackground	TokenNameIdentifier
(	TokenNameLPAREN
color	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTextBackground	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
v	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
textPane	TokenNameIdentifier
.	TokenNameDOT
setBackground	TokenNameIdentifier
(	TokenNameLPAREN
parseColor	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
createDefaultFontAttributes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Priority	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
prio	TokenNameIdentifier
=	TokenNameEQUAL
Priority	TokenNameIdentifier
.	TokenNameDOT
getAllPossiblePriorities	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fontAttributes	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
prio	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
MutableAttributeSet	TokenNameIdentifier
att	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleAttributeSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fontAttributes	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
prio	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
att	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
setTextColor	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
.	TokenNameDOT
FATAL	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
.	TokenNameDOT
red	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setTextColor	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
.	TokenNameDOT
ERROR	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
.	TokenNameDOT
magenta	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setTextColor	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
.	TokenNameDOT
WARN	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
.	TokenNameDOT
orange	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setTextColor	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
.	TokenNameDOT
INFO	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
.	TokenNameDOT
blue	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setTextColor	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
.	TokenNameDOT
DEBUG	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
.	TokenNameDOT
black	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Color	TokenNameIdentifier
parseColor	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
v	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringTokenizer	TokenNameIdentifier
st	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
,	TokenNameCOMMA
","	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
val	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
{	TokenNameLBRACE
255	TokenNameIntegerLiteral
,	TokenNameCOMMA
255	TokenNameIntegerLiteral
,	TokenNameCOMMA
255	TokenNameIntegerLiteral
,	TokenNameCOMMA
255	TokenNameIntegerLiteral
}	TokenNameRBRACE
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
val	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
Integer	TokenNameIdentifier
.	TokenNameDOT
parseInt	TokenNameIdentifier
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
new	TokenNamenew
Color	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
val	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
val	TokenNameIdentifier
[	TokenNameLBRACKET
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
val	TokenNameIdentifier
[	TokenNameLBRACKET
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setTextColor	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
p	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
v	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StyleConstants	TokenNameIdentifier
.	TokenNameDOT
setForeground	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
MutableAttributeSet	TokenNameIdentifier
)	TokenNameRPAREN
fontAttributes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
parseColor	TokenNameIdentifier
(	TokenNameLPAREN
v	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setTextColor	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
p	TokenNameIdentifier
,	TokenNameCOMMA
Color	TokenNameIdentifier
c	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StyleConstants	TokenNameIdentifier
.	TokenNameDOT
setForeground	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
MutableAttributeSet	TokenNameIdentifier
)	TokenNameRPAREN
fontAttributes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
p	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
c	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setTextFontSize	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Enumeration	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
fontAttributes	TokenNameIdentifier
.	TokenNameDOT
elements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StyleConstants	TokenNameIdentifier
.	TokenNameDOT
setFontSize	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
MutableAttributeSet	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
size	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setTextFontName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Enumeration	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
fontAttributes	TokenNameIdentifier
.	TokenNameDOT
elements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
e	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
StyleConstants	TokenNameIdentifier
.	TokenNameDOT
setFontFamily	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
MutableAttributeSet	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
setEventBufferSize	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
bufferSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
eventBufferMaxSize	TokenNameIdentifier
=	TokenNameEQUAL
bufferSize	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
newEvents	TokenNameIdentifier
(	TokenNameLPAREN
EventBufferElement	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
evts	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
eventBuffer	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
evts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
eventBufferMaxSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
evts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
eventBuffer	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
eventViewIndex	TokenNameIdentifier
-=	TokenNameMINUS_EQUAL
evts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
eventViewIndex	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
eventViewIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
evts	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
eventBuffer	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
evts	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
eventBuffer	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
maxR	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
cbxTail	TokenNameIdentifier
.	TokenNameDOT
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
eventViewIndex	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
eventBuffer	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
maxR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
maxR	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
eventBuffer	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
eventViewIndex	TokenNameIdentifier
&&	TokenNameAND_AND
eventBuffer	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
<=	TokenNameLESS_EQUAL
(	TokenNameLPAREN
eventViewIndex	TokenNameIdentifier
+	TokenNamePLUS
maxR	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
drawText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
maxR	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
void	TokenNamevoid
drawText	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
maxR	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
maxR	TokenNameIdentifier
=	TokenNameEQUAL
textPane	TokenNameIdentifier
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
/	TokenNameDIVIDE
textPane	TokenNameIdentifier
.	TokenNameDOT
getFontMetrics	TokenNameIdentifier
(	TokenNameLPAREN
textPane	TokenNameIdentifier
.	TokenNameDOT
getFont	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getHeight	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
doc	TokenNameIdentifier
.	TokenNameDOT
remove	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
doc	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
eventViewIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
eventBuffer	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
(	TokenNameLPAREN
eventViewIndex	TokenNameIdentifier
+	TokenNamePLUS
maxR	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
EventBufferElement	TokenNameIdentifier
evt	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
EventBufferElement	TokenNameIdentifier
)	TokenNameRPAREN
eventBuffer	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
doc	TokenNameIdentifier
.	TokenNameDOT
insertString	TokenNameIdentifier
(	TokenNameLPAREN
doc	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
evt	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
MutableAttributeSet	TokenNameIdentifier
)	TokenNameRPAREN
fontAttributes	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
evt	TokenNameIdentifier
.	TokenNameDOT
prio	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
