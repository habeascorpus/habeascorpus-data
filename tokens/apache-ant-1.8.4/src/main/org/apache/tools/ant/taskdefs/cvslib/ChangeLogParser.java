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
.	TokenNameDOT
cvslib	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
ParseException	TokenNameIdentifier
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
Date	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
ArrayList	TokenNameIdentifier
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
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
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
Locale	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
taskdefs	TokenNameIdentifier
.	TokenNameDOT
AbstractCvsTask	TokenNameIdentifier
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
util	TokenNameIdentifier
.	TokenNameDOT
CollectionUtils	TokenNameIdentifier
;	TokenNameSEMICOLON
class	TokenNameclass
ChangeLogParser	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
GET_FILE	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
GET_DATE	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
GET_COMMENT	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
GET_REVISION	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
GET_PREVIOUS_REV	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
SimpleDateFormat	TokenNameIdentifier
INPUT_DATE	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
"yyyy/MM/dd HH:mm:ss"	TokenNameStringLiteral
,	TokenNameCOMMA
Locale	TokenNameIdentifier
.	TokenNameDOT
US	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
SimpleDateFormat	TokenNameIdentifier
CVS1129_INPUT_DATE	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
SimpleDateFormat	TokenNameIdentifier
(	TokenNameLPAREN
"yyyy-MM-dd HH:mm:ss Z"	TokenNameStringLiteral
,	TokenNameCOMMA
Locale	TokenNameIdentifier
.	TokenNameDOT
US	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
TimeZone	TokenNameIdentifier
utc	TokenNameIdentifier
=	TokenNameEQUAL
TimeZone	TokenNameIdentifier
.	TokenNameDOT
getTimeZone	TokenNameIdentifier
(	TokenNameLPAREN
"UTC"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
INPUT_DATE	TokenNameIdentifier
.	TokenNameDOT
setTimeZone	TokenNameIdentifier
(	TokenNameLPAREN
utc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
CVS1129_INPUT_DATE	TokenNameIdentifier
.	TokenNameDOT
setTimeZone	TokenNameIdentifier
(	TokenNameLPAREN
utc	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
String	TokenNameIdentifier
file	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
date	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
author	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
comment	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
revision	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
previousRevision	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
status	TokenNameIdentifier
=	TokenNameEQUAL
GET_FILE	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
Hashtable	TokenNameIdentifier
entries	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
remote	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
moduleNames	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
moduleNameLengths	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ChangeLogParser	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
false	TokenNamefalse
,	TokenNameCOMMA
""	TokenNameStringLiteral
,	TokenNameCOMMA
CollectionUtils	TokenNameIdentifier
.	TokenNameDOT
EMPTY_LIST	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ChangeLogParser	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
remote	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
packageName	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
modules	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
remote	TokenNameIdentifier
=	TokenNameEQUAL
remote	TokenNameIdentifier
;	TokenNameSEMICOLON
ArrayList	TokenNameIdentifier
names	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ArrayList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
packageName	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
StringTokenizer	TokenNameIdentifier
tok	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringTokenizer	TokenNameIdentifier
(	TokenNameLPAREN
packageName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tok	TokenNameIdentifier
.	TokenNameDOT
hasMoreTokens	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
names	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
tok	TokenNameIdentifier
.	TokenNameDOT
nextToken	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
modules	TokenNameIdentifier
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
AbstractCvsTask	TokenNameIdentifier
.	TokenNameDOT
Module	TokenNameIdentifier
m	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
AbstractCvsTask	TokenNameIdentifier
.	TokenNameDOT
Module	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
names	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
m	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
moduleNames	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
names	TokenNameIdentifier
.	TokenNameDOT
toArray	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
String	TokenNameIdentifier
[	TokenNameLBRACKET
names	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
moduleNameLengths	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
moduleNames	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
]	TokenNameRBRACKET
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
moduleNames	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
moduleNameLengths	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
moduleNames	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
CVSEntry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getEntrySetAsArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
CVSEntry	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
array	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CVSEntry	TokenNameIdentifier
[	TokenNameLBRACKET
entries	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Enumeration	TokenNameIdentifier
e	TokenNameIdentifier
=	TokenNameEQUAL
entries	TokenNameIdentifier
.	TokenNameDOT
elements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
e	TokenNameIdentifier
.	TokenNameDOT
hasMoreElements	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
array	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
CVSEntry	TokenNameIdentifier
)	TokenNameRPAREN
e	TokenNameIdentifier
.	TokenNameDOT
nextElement	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
array	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
stdout	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
status	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
GET_FILE	TokenNameIdentifier
:	TokenNameCOLON
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
processFile	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
GET_REVISION	TokenNameIdentifier
:	TokenNameCOLON
processRevision	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
GET_DATE	TokenNameIdentifier
:	TokenNameCOLON
processDate	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
GET_COMMENT	TokenNameIdentifier
:	TokenNameCOLON
processComment	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
case	TokenNamecase
GET_PREVIOUS_REV	TokenNameIdentifier
:	TokenNameCOLON
processGetPreviousRevision	TokenNameIdentifier
(	TokenNameLPAREN
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
processComment	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
lineSeparator	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"line.separator"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"============================================================================="	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
end	TokenNameIdentifier
=	TokenNameEQUAL
comment	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
lineSeparator	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
comment	TokenNameIdentifier
=	TokenNameEQUAL
comment	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
end	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
saveEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
status	TokenNameIdentifier
=	TokenNameEQUAL
GET_FILE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"----------------------------"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
end	TokenNameIdentifier
=	TokenNameEQUAL
comment	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
lineSeparator	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
comment	TokenNameIdentifier
=	TokenNameEQUAL
comment	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
end	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
status	TokenNameIdentifier
=	TokenNameEQUAL
GET_PREVIOUS_REV	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
comment	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
line	TokenNameIdentifier
+	TokenNamePLUS
lineSeparator	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
processFile	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
remote	TokenNameIdentifier
&&	TokenNameAND_AND
line	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"Working file:"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
file	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
14	TokenNameIntegerLiteral
,	TokenNameCOMMA
line	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
status	TokenNameIdentifier
=	TokenNameEQUAL
GET_REVISION	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
remote	TokenNameIdentifier
&&	TokenNameAND_AND
line	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"RCS file:"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
startOfFileName	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
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
moduleNames	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
index	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
moduleNames	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
startOfFileName	TokenNameIdentifier
=	TokenNameEQUAL
index	TokenNameIdentifier
+	TokenNamePLUS
moduleNameLengths	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
endOfFileName	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
",v"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
endOfFileName	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
file	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startOfFileName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
file	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startOfFileName	TokenNameIdentifier
,	TokenNameCOMMA
endOfFileName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
status	TokenNameIdentifier
=	TokenNameEQUAL
GET_REVISION	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
processRevision	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"revision"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
revision	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
9	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
status	TokenNameIdentifier
=	TokenNameEQUAL
GET_DATE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"======"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
status	TokenNameIdentifier
=	TokenNameEQUAL
GET_FILE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
processDate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
line	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"date:"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
endOfDateIndex	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
';'	TokenNameCharacterLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
date	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
"date: "	TokenNameStringLiteral
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
endOfDateIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
startOfAuthorIndex	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
"author: "	TokenNameStringLiteral
,	TokenNameCOMMA
endOfDateIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
endOfAuthorIndex	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
';'	TokenNameCharacterLiteral
,	TokenNameCOMMA
startOfAuthorIndex	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
author	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
"author: "	TokenNameStringLiteral
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
startOfAuthorIndex	TokenNameIdentifier
,	TokenNameCOMMA
endOfAuthorIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
status	TokenNameIdentifier
=	TokenNameEQUAL
GET_COMMENT	TokenNameIdentifier
;	TokenNameSEMICOLON
comment	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
processGetPreviousRevision	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
line	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
line	TokenNameIdentifier
.	TokenNameDOT
startsWith	TokenNameIdentifier
(	TokenNameLPAREN
"revision "	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"Unexpected line from CVS: "	TokenNameStringLiteral
+	TokenNamePLUS
line	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
previousRevision	TokenNameIdentifier
=	TokenNameEQUAL
line	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
"revision "	TokenNameStringLiteral
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
saveEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
revision	TokenNameIdentifier
=	TokenNameEQUAL
previousRevision	TokenNameIdentifier
;	TokenNameSEMICOLON
status	TokenNameIdentifier
=	TokenNameEQUAL
GET_DATE	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
saveEntry	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
final	TokenNamefinal
String	TokenNameIdentifier
entryKey	TokenNameIdentifier
=	TokenNameEQUAL
date	TokenNameIdentifier
+	TokenNamePLUS
author	TokenNameIdentifier
+	TokenNamePLUS
comment	TokenNameIdentifier
;	TokenNameSEMICOLON
CVSEntry	TokenNameIdentifier
entry	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
entries	TokenNameIdentifier
.	TokenNameDOT
containsKey	TokenNameIdentifier
(	TokenNameLPAREN
entryKey	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Date	TokenNameIdentifier
dateObject	TokenNameIdentifier
=	TokenNameEQUAL
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
date	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
entry	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
CVSEntry	TokenNameIdentifier
(	TokenNameLPAREN
dateObject	TokenNameIdentifier
,	TokenNameCOMMA
author	TokenNameIdentifier
,	TokenNameCOMMA
comment	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
entries	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
entryKey	TokenNameIdentifier
,	TokenNameCOMMA
entry	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
entry	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
CVSEntry	TokenNameIdentifier
)	TokenNameRPAREN
entries	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
entryKey	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
entry	TokenNameIdentifier
.	TokenNameDOT
addFile	TokenNameIdentifier
(	TokenNameLPAREN
file	TokenNameIdentifier
,	TokenNameCOMMA
revision	TokenNameIdentifier
,	TokenNameCOMMA
previousRevision	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Date	TokenNameIdentifier
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
date	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
INPUT_DATE	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
date	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ParseException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
return	TokenNamereturn
CVS1129_INPUT_DATE	TokenNameIdentifier
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
date	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
ParseException	TokenNameIdentifier
e2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalStateException	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid date format: "	TokenNameStringLiteral
+	TokenNamePLUS
date	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
file	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
date	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
author	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
comment	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
revision	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
previousRevision	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE