package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
lf5	TokenNameIdentifier
.	TokenNameDOT
viewer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
LogTableColumn	TokenNameIdentifier
implements	TokenNameimplements
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
4275827753626456547L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
DATE	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
"Date"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
THREAD	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
"Thread"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
MESSAGE_NUM	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
"Message #"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
LEVEL	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
"Level"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
NDC	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
"NDC"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
CATEGORY	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
"Category"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
MESSAGE	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
"Message"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
LOCATION	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
"Location"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
THROWN	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
"Thrown"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
_label	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
_log4JColumns	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
Map	TokenNameIdentifier
_logTableColumnMap	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
_log4JColumns	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
LogTableColumn	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
DATE	TokenNameIdentifier
,	TokenNameCOMMA
THREAD	TokenNameIdentifier
,	TokenNameCOMMA
MESSAGE_NUM	TokenNameIdentifier
,	TokenNameCOMMA
LEVEL	TokenNameIdentifier
,	TokenNameCOMMA
NDC	TokenNameIdentifier
,	TokenNameCOMMA
CATEGORY	TokenNameIdentifier
,	TokenNameCOMMA
MESSAGE	TokenNameIdentifier
,	TokenNameCOMMA
LOCATION	TokenNameIdentifier
,	TokenNameCOMMA
THROWN	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
_logTableColumnMap	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
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
_log4JColumns	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
_logTableColumnMap	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
_log4JColumns	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
_log4JColumns	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
LogTableColumn	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
label	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
_label	TokenNameIdentifier
=	TokenNameEQUAL
label	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_label	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
column	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
LogTableColumnFormatException	TokenNameIdentifier
{	TokenNameLBRACE
LogTableColumn	TokenNameIdentifier
tableColumn	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
column	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
column	TokenNameIdentifier
=	TokenNameEQUAL
column	TokenNameIdentifier
.	TokenNameDOT
trim	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tableColumn	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
LogTableColumn	TokenNameIdentifier
)	TokenNameRPAREN
_logTableColumnMap	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
column	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
tableColumn	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"Error while trying to parse ("	TokenNameStringLiteral
+	TokenNamePLUS
column	TokenNameIdentifier
+	TokenNamePLUS
") into"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
buf	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" a LogTableColumn."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
LogTableColumnFormatException	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
tableColumn	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
o	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
boolean	TokenNameboolean
equals	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
o	TokenNameIdentifier
instanceof	TokenNameinstanceof
LogTableColumn	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
LogTableColumn	TokenNameIdentifier
)	TokenNameRPAREN
o	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getLabel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
equals	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
equals	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_label	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_label	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
List	TokenNameIdentifier
getLogTableColumns	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
_log4JColumns	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
LogTableColumn	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getLogTableColumnArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_log4JColumns	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
