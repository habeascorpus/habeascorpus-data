package	TokenNamepackage
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
selectors	TokenNameIdentifier
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
types	TokenNameIdentifier
.	TokenNameDOT
Parameter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DateSelectorTest	TokenNameIdentifier
extends	TokenNameextends
BaseSelectorTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
DateSelectorTest	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
BaseSelector	TokenNameIdentifier
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
DateSelector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testValidate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
DateSelector	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
,	TokenNameCOMMA
filenames	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
files	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"DateSelector did not check for required fields"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be1	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"You must provide a datetime or the number of "	TokenNameStringLiteral
+	TokenNamePLUS
"milliseconds."	TokenNameStringLiteral
,	TokenNameCOMMA
be1	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setDatetime	TokenNameIdentifier
(	TokenNameLPAREN
"01/01/1969 01:01 AM"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
,	TokenNameCOMMA
filenames	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
files	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"DateSelector did not check for Datetime being in the "	TokenNameStringLiteral
+	TokenNamePLUS
"allowable range"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Date of 01/01/1969 01:01 AM results in negative "	TokenNameStringLiteral
+	TokenNamePLUS
"milliseconds value relative to epoch (January 1, "	TokenNameStringLiteral
+	TokenNamePLUS
"1970, 00:00:00 GMT)."	TokenNameStringLiteral
,	TokenNameCOMMA
be2	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setDatetime	TokenNameIdentifier
(	TokenNameLPAREN
"this is not a date"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
,	TokenNameCOMMA
filenames	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
files	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"DateSelector did not check for Datetime being in a "	TokenNameStringLiteral
+	TokenNamePLUS
"valid format"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be3	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Date of this is not a date"	TokenNameStringLiteral
+	TokenNamePLUS
" Cannot be parsed correctly. It should be in"	TokenNameStringLiteral
+	TokenNamePLUS
" MM/DD/YYYY HH:MM AM_PM format."	TokenNameStringLiteral
,	TokenNameCOMMA
be3	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Parameter	TokenNameIdentifier
param	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Parameter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"garbage in"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"garbage out"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Parameter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
params	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Parameter	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
params	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
param	TokenNameIdentifier
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setParameters	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
,	TokenNameCOMMA
filenames	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
files	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"DateSelector did not check for valid parameter element"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be4	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid parameter garbage in"	TokenNameStringLiteral
,	TokenNameCOMMA
be4	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Parameter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"millis"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"garbage out"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
params	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
param	TokenNameIdentifier
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setParameters	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
,	TokenNameCOMMA
filenames	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
files	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"DateSelector did not check for valid millis parameter"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be5	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid millisecond setting garbage out"	TokenNameStringLiteral
,	TokenNameCOMMA
be5	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Parameter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"granularity"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"garbage out"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
params	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
param	TokenNameIdentifier
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setParameters	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
isSelected	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
,	TokenNameCOMMA
filenames	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
files	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fail	TokenNameIdentifier
(	TokenNameLPAREN
"DateSelector did not check for valid granularity parameter"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
BuildException	TokenNameIdentifier
be6	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"Invalid granularity setting garbage out"	TokenNameStringLiteral
,	TokenNameCOMMA
be6	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testSelectionBehaviour	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
DateSelector	TokenNameIdentifier
s	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
results	TokenNameIdentifier
;	TokenNameSEMICOLON
DateSelector	TokenNameIdentifier
.	TokenNameDOT
TimeComparisons	TokenNameIdentifier
before	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DateSelector	TokenNameIdentifier
.	TokenNameDOT
TimeComparisons	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
before	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"before"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DateSelector	TokenNameIdentifier
.	TokenNameDOT
TimeComparisons	TokenNameIdentifier
equal	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DateSelector	TokenNameIdentifier
.	TokenNameDOT
TimeComparisons	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
equal	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"equal"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DateSelector	TokenNameIdentifier
.	TokenNameDOT
TimeComparisons	TokenNameIdentifier
after	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DateSelector	TokenNameIdentifier
.	TokenNameDOT
TimeComparisons	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
after	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"after"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
makeBed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setDatetime	TokenNameIdentifier
(	TokenNameLPAREN
"10/10/1999 1:45 PM"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setWhen	TokenNameIdentifier
(	TokenNameLPAREN
before	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
selectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TFFFFFFFFFFT"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setDatetime	TokenNameIdentifier
(	TokenNameLPAREN
"10/10/1999 1:45 PM"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setWhen	TokenNameIdentifier
(	TokenNameLPAREN
before	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setCheckdirs	TokenNameIdentifier
(	TokenNameLPAREN
true	TokenNametrue
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
selectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"FFFFFFFFFFFF"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setDatetime	TokenNameIdentifier
(	TokenNameLPAREN
"10/10/1999 1:45 PM"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setWhen	TokenNameIdentifier
(	TokenNameLPAREN
after	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
selectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TTTTTTTTTTTT"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setDatetime	TokenNameIdentifier
(	TokenNameLPAREN
"11/21/2001 4:54 AM"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setWhen	TokenNameIdentifier
(	TokenNameLPAREN
before	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
selectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TFTFFFFFFFFT"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setDatetime	TokenNameIdentifier
(	TokenNameLPAREN
"11/21/2001 4:55 AM"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
milliseconds	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
getMillis	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setWhen	TokenNameIdentifier
(	TokenNameLPAREN
equal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
selectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TTFFTFFFTTTT"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setMillis	TokenNameIdentifier
(	TokenNameLPAREN
milliseconds	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setWhen	TokenNameIdentifier
(	TokenNameLPAREN
equal	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
selectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TTFFTFFFTTTT"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setDatetime	TokenNameIdentifier
(	TokenNameLPAREN
"11/21/2001 4:56 AM"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setWhen	TokenNameIdentifier
(	TokenNameLPAREN
after	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
selectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TFFTFTTTFFFT"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Parameter	TokenNameIdentifier
param1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Parameter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Parameter	TokenNameIdentifier
param2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Parameter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param1	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"datetime"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param1	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"11/21/2001 4:56 AM"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param2	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
"when"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
param2	TokenNameIdentifier
.	TokenNameDOT
setValue	TokenNameIdentifier
(	TokenNameLPAREN
"after"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Parameter	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
params	TokenNameIdentifier
=	TokenNameEQUAL
{	TokenNameLBRACE
param1	TokenNameIdentifier
,	TokenNameCOMMA
param2	TokenNameIdentifier
}	TokenNameRBRACE
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setParameters	TokenNameIdentifier
(	TokenNameLPAREN
params	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
selectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TFFTFTTTFFFT"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
makeMirror	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
long	TokenNamelong
testtime	TokenNameIdentifier
=	TokenNameEQUAL
mirrorfiles	TokenNameIdentifier
[	TokenNameLBRACKET
5	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
lastModified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setMillis	TokenNameIdentifier
(	TokenNameLPAREN
testtime	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setWhen	TokenNameIdentifier
(	TokenNameLPAREN
after	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setGranularity	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
mirrorSelectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TFFFFTTTTTTT"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DateSelector	TokenNameIdentifier
)	TokenNameRPAREN
getInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
testtime	TokenNameIdentifier
=	TokenNameEQUAL
mirrorfiles	TokenNameIdentifier
[	TokenNameLBRACKET
6	TokenNameIntegerLiteral
]	TokenNameRBRACKET
.	TokenNameDOT
lastModified	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setMillis	TokenNameIdentifier
(	TokenNameLPAREN
testtime	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setWhen	TokenNameIdentifier
(	TokenNameLPAREN
before	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
setGranularity	TokenNameIdentifier
(	TokenNameLPAREN
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
results	TokenNameIdentifier
=	TokenNameEQUAL
mirrorSelectionString	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"TTTTTTTFFFFT"	TokenNameStringLiteral
,	TokenNameCOMMA
results	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
cleanupMirror	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
finally	TokenNamefinally
{	TokenNameLBRACE
cleanupBed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
