package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
SimpleDateFormat	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Calendar	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Date	TokenNameIdentifier
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
HashMap	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Locale	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
NoSuchElementException	TokenNameIdentifier
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
TimeZone	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
BuildException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Location	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Project	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
Task	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
types	TokenNameIdentifier
.	TokenNameDOT
EnumeratedAttribute	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Tstamp	TokenNameIdentifier
extends	TokenNameextends
Task	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Vector	TokenNameIdentifier
customFormats	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
prefix	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
setPrefix	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
prefix	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
prefix	TokenNameIdentifier
=	TokenNameEQUAL
prefix	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
this	TokenNamethis
.	TokenNameDOT
prefix	TokenNameIdentifier
.	TokenNameDOT
endsWith	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
prefix	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
"."	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
BuildException	TokenNameIdentifier
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
Date	TokenNameIdentifier
d	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Date	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Enumeration	TokenNameIdentifier
i	TokenNameIdentifier
=	TokenNameEQUAL
customFormats	TokenNameIdentifier
.	TokenNameDOT
elements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
i	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CustomFormat	TokenNameIdentifier
cts	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CustomFormat	TokenNameIdentifier
)	TokenNameRPAREN
i	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
cts	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
d	TokenNameIdentifier
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
SimpleDateFormat	TokenNameIdentifier
dstamp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
"yyyyMMdd"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"DSTAMP"	TokenNameStringLiteral
,	TokenNameCOMMA
dstamp	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SimpleDateFormat	TokenNameIdentifier
tstamp	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
"HHmm"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"TSTAMP"	TokenNameStringLiteral
,	TokenNameCOMMA
tstamp	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
SimpleDateFormat	TokenNameIdentifier
today	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
"MMMM d yyyy"	TokenNameStringLiteral
,	TokenNameCOMMA
Locale	TokenNameIdentifier
.	TokenNameDOT
US	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"TODAY"	TokenNameStringLiteral
,	TokenNameCOMMA
today	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
d	TokenNameIdentifier
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
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
CustomFormat	TokenNameIdentifier
createFormat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
CustomFormat	TokenNameIdentifier
cts	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CustomFormat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
customFormats	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
cts	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
cts	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
getProject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
setNewProperty	TokenNameIdentifier
(	TokenNameLPAREN
prefix	TokenNameIdentifier
+	TokenNamePLUS
name	TokenNameIdentifier
,	TokenNameCOMMA
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
class	TokenNameclass
CustomFormat	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
TimeZone	TokenNameIdentifier
timeZone	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
propertyName	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
language	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
country	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
variant	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
offset	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
field	TokenNameIdentifier
=	TokenNameEQUAL
Calendar	TokenNameIdentifier
.	TokenNameDOT
DATE	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
CustomFormat	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
propertyName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
propertyName	TokenNameIdentifier
=	TokenNameEQUAL
propertyName	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setPattern	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
pattern	TokenNameIdentifier
=	TokenNameEQUAL
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLocale	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
locale	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringTokenizer	TokenNameIdentifier
st	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
locale	TokenNameIdentifier
,	TokenNameCOMMA
"   ,"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
language	TokenNameIdentifier
=	TokenNameEQUAL
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
country	TokenNameIdentifier
=	TokenNameEQUAL
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
variant	TokenNameIdentifier
=	TokenNameEQUAL
st	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"bad locale format"	TokenNameStringLiteral
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
country	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoSuchElementException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"bad locale format"	TokenNameStringLiteral
,	TokenNameCOMMA
e	TokenNameIdentifier
,	TokenNameCOMMA
getLocation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setTimezone	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
id	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
timeZone	TokenNameIdentifier
=	TokenNameEQUAL
TimeZone	TokenNameIdentifier
.	TokenNameDOT
getTimeZone	TokenNameIdentifier
(	TokenNameLPAREN
id	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOffset	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
offset	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
offset	TokenNameIdentifier
=	TokenNameEQUAL
offset	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setUnit	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
unit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
log	TokenNameIdentifier
(	TokenNameLPAREN
"DEPRECATED - The setUnit(String) method has been deprecated."	TokenNameStringLiteral
+	TokenNamePLUS
" Use setUnit(Tstamp.Unit) instead."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Unit	TokenNameIdentifier
u	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Unit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
u	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
unit	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
field	TokenNameIdentifier
=	TokenNameEQUAL
u	TokenNameIdentifier
.	TokenNameDOT
getCalendarField	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setUnit	TokenNameIdentifier
(	TokenNameLPAREN
Unit	TokenNameIdentifier
unit	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
field	TokenNameIdentifier
=	TokenNameEQUAL
unit	TokenNameIdentifier
.	TokenNameDOT
getCalendarField	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
execute	TokenNameIdentifier
(	TokenNameLPAREN
Project	TokenNameIdentifier
project	TokenNameIdentifier
,	TokenNameCOMMA
Date	TokenNameIdentifier
date	TokenNameIdentifier
,	TokenNameCOMMA
Location	TokenNameIdentifier
location	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
propertyName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"property attribute must be provided"	TokenNameStringLiteral
,	TokenNameCOMMA
location	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
pattern	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
BuildException	TokenNameIdentifier
(	TokenNameLPAREN
"pattern attribute must be provided"	TokenNameStringLiteral
,	TokenNameCOMMA
location	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
SimpleDateFormat	TokenNameIdentifier
sdf	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
language	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
sdf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
pattern	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
variant	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
sdf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
pattern	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Locale	TokenNameIdentifier
(	TokenNameLPAREN
language	TokenNameIdentifier
,	TokenNameCOMMA
country	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
sdf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
pattern	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Locale	TokenNameIdentifier
(	TokenNameLPAREN
language	TokenNameIdentifier
,	TokenNameCOMMA
country	TokenNameIdentifier
,	TokenNameCOMMA
variant	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
offset	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
Calendar	TokenNameIdentifier
calendar	TokenNameIdentifier
=	TokenNameEQUAL
Calendar	TokenNameIdentifier
.	TokenNameDOT
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
calendar	TokenNameIdentifier
.	TokenNameDOT
setTime	TokenNameIdentifier
(	TokenNameLPAREN
date	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
calendar	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
field	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
date	TokenNameIdentifier
=	TokenNameEQUAL
calendar	TokenNameIdentifier
.	TokenNameDOT
getTime	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
timeZone	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
sdf	TokenNameIdentifier
.	TokenNameDOT
setTimeZone	TokenNameIdentifier
(	TokenNameLPAREN
timeZone	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Tstamp	TokenNameIdentifier
.	TokenNameDOT
this	TokenNamethis
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
propertyName	TokenNameIdentifier
,	TokenNameCOMMA
sdf	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
date	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
class	TokenNameclass
Unit	TokenNameIdentifier
extends	TokenNameextends
EnumeratedAttribute	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
MILLISECOND	TokenNameIdentifier
=	TokenNameEQUAL
"millisecond"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
SECOND	TokenNameIdentifier
=	TokenNameEQUAL
"second"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
MINUTE	TokenNameIdentifier
=	TokenNameEQUAL
"minute"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
HOUR	TokenNameIdentifier
=	TokenNameEQUAL
"hour"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DAY	TokenNameIdentifier
=	TokenNameEQUAL
"day"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
WEEK	TokenNameIdentifier
=	TokenNameEQUAL
"week"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
MONTH	TokenNameIdentifier
=	TokenNameEQUAL
"month"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
YEAR	TokenNameIdentifier
=	TokenNameEQUAL
"year"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
UNITS	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
MILLISECOND	TokenNameIdentifier
,	TokenNameCOMMA
SECOND	TokenNameIdentifier
,	TokenNameCOMMA
MINUTE	TokenNameIdentifier
,	TokenNameCOMMA
HOUR	TokenNameIdentifier
,	TokenNameCOMMA
DAY	TokenNameIdentifier
,	TokenNameCOMMA
WEEK	TokenNameIdentifier
,	TokenNameCOMMA
MONTH	TokenNameIdentifier
,	TokenNameCOMMA
YEAR	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
private	TokenNameprivate
Map	TokenNameIdentifier
calendarFields	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
Unit	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
calendarFields	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
MILLISECOND	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
MILLISECOND	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
calendarFields	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
SECOND	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
SECOND	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
calendarFields	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
MINUTE	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
MINUTE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
calendarFields	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
HOUR	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
HOUR_OF_DAY	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
calendarFields	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
DAY	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
DATE	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
calendarFields	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
WEEK	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
WEEK_OF_YEAR	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
calendarFields	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
MONTH	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
MONTH	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
calendarFields	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
YEAR	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Integer	TokenNameIdentifier
(	TokenNameLPAREN
Calendar	TokenNameIdentifier
.	TokenNameDOT
YEAR	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getCalendarField	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
key	TokenNameIdentifier
=	TokenNameEQUAL
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toLowerCase	TokenNameIdentifier
(	TokenNameLPAREN
Locale	TokenNameIdentifier
.	TokenNameDOT
ENGLISH	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Integer	TokenNameIdentifier
i	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Integer	TokenNameIdentifier
)	TokenNameRPAREN
calendarFields	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
key	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
i	TokenNameIdentifier
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getValues	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
UNITS	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
