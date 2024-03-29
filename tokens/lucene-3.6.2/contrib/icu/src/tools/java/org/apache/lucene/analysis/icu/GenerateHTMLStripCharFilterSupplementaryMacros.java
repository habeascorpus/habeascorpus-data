package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
analysis	TokenNameIdentifier
.	TokenNameDOT
icu	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
DateFormat	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
*	TokenNameMULTIPLY
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
ibm	TokenNameIdentifier
.	TokenNameDOT
icu	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
UnicodeSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
ibm	TokenNameIdentifier
.	TokenNameDOT
icu	TokenNameIdentifier
.	TokenNameDOT
text	TokenNameIdentifier
.	TokenNameDOT
UnicodeSetIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
com	TokenNameIdentifier
.	TokenNameDOT
ibm	TokenNameIdentifier
.	TokenNameDOT
icu	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
VersionInfo	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
GenerateHTMLStripCharFilterSupplementaryMacros	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
UnicodeSet	TokenNameIdentifier
BMP	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UnicodeSet	TokenNameIdentifier
(	TokenNameLPAREN
"[ -￿]"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
NL	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"line.separator"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
DateFormat	TokenNameIdentifier
DATE_FORMAT	TokenNameIdentifier
=	TokenNameEQUAL
DateFormat	TokenNameIdentifier
.	TokenNameDOT
getDateTimeInstance	TokenNameIdentifier
(	TokenNameLPAREN
DateFormat	TokenNameIdentifier
.	TokenNameDOT
FULL	TokenNameIdentifier
,	TokenNameCOMMA
DateFormat	TokenNameIdentifier
.	TokenNameDOT
FULL	TokenNameIdentifier
,	TokenNameCOMMA
Locale	TokenNameIdentifier
.	TokenNameDOT
US	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
DATE_FORMAT	TokenNameIdentifier
.	TokenNameDOT
setTimeZone	TokenNameIdentifier
(	TokenNameLPAREN
TimeZone	TokenNameIdentifier
.	TokenNameDOT
getTimeZone	TokenNameIdentifier
(	TokenNameLPAREN
"UTC"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
APACHE_LICENSE	TokenNameIdentifier
=	TokenNameEQUAL
"/*"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" * Copyright 2010 The Apache Software Foundation."	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" *"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" * Licensed under the Apache License, Version 2.0 (the "License");"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" * you may not use this file except in compliance with the License."	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" * You may obtain a copy of the License at"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" *"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" *      http://www.apache.org/licenses/LICENSE-2.0"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" *"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" * Unless required by applicable law or agreed to in writing, software"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" * distributed under the License is distributed on an "AS IS" BASIS,"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied."	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" * See the License for the specific language governing permissions and"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" * limitations under the License."	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
" */"	TokenNameStringLiteral
+	TokenNamePLUS
NL	TokenNameIdentifier
+	TokenNamePLUS
NL	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
args	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
outputHeader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outputMacro	TokenNameIdentifier
(	TokenNameLPAREN
"ID_Start_Supp"	TokenNameStringLiteral
,	TokenNameCOMMA
"[:ID_Start:]"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
outputMacro	TokenNameIdentifier
(	TokenNameLPAREN
"ID_Continue_Supp"	TokenNameStringLiteral
,	TokenNameCOMMA
"[:ID_Continue:]"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
void	TokenNamevoid
outputHeader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
APACHE_LICENSE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
"// Generated using ICU4J "	TokenNameStringLiteral
+	TokenNamePLUS
VersionInfo	TokenNameIdentifier
.	TokenNameDOT
ICU_VERSION	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" on "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
DATE_FORMAT	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
Date	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"// by "	TokenNameStringLiteral
+	TokenNamePLUS
GenerateHTMLStripCharFilterSupplementaryMacros	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
NL	TokenNameIdentifier
+	TokenNamePLUS
NL	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
void	TokenNamevoid
outputMacro	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
UnicodeSet	TokenNameIdentifier
set	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UnicodeSet	TokenNameIdentifier
(	TokenNameLPAREN
pattern	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
set	TokenNameIdentifier
.	TokenNameDOT
removeAll	TokenNameIdentifier
(	TokenNameLPAREN
BMP	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
+	TokenNamePLUS
" = ("	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
set	TokenNameIdentifier
.	TokenNameDOT
isEmpty	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"   []"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
HashMap	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
,	TokenNameCOMMA
UnicodeSet	TokenNameIdentifier
>	TokenNameGREATER
utf16ByLead	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
,	TokenNameCOMMA
UnicodeSet	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
UnicodeSetIterator	TokenNameIdentifier
it	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UnicodeSetIterator	TokenNameIdentifier
(	TokenNameLPAREN
set	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
char	TokenNamechar
utf16	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
Character	TokenNameIdentifier
.	TokenNameDOT
toChars	TokenNameIdentifier
(	TokenNameLPAREN
it	TokenNameIdentifier
.	TokenNameDOT
codepoint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UnicodeSet	TokenNameIdentifier
trails	TokenNameIdentifier
=	TokenNameEQUAL
utf16ByLead	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
utf16	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
trails	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
trails	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UnicodeSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
utf16ByLead	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
utf16	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
,	TokenNameCOMMA
trails	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
trails	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
utf16	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
UnicodeSet	TokenNameIdentifier
>	TokenNameGREATER
utf16ByTrail	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
UnicodeSet	TokenNameIdentifier
>	TokenNameGREATER
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
Character	TokenNameIdentifier
,	TokenNameCOMMA
UnicodeSet	TokenNameIdentifier
>	TokenNameGREATER
entry	TokenNameIdentifier
:	TokenNameCOLON
utf16ByLead	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
trail	TokenNameIdentifier
=	TokenNameEQUAL
entry	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getRegexEquivalent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
UnicodeSet	TokenNameIdentifier
leads	TokenNameIdentifier
=	TokenNameEQUAL
utf16ByTrail	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
trail	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
leads	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
leads	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
UnicodeSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
utf16ByTrail	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
trail	TokenNameIdentifier
,	TokenNameCOMMA
leads	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
leads	TokenNameIdentifier
.	TokenNameDOT
add	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
boolean	TokenNameboolean
isFirst	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Map	TokenNameIdentifier
.	TokenNameDOT
Entry	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
UnicodeSet	TokenNameIdentifier
>	TokenNameGREATER
entry	TokenNameIdentifier
:	TokenNameCOLON
utf16ByTrail	TokenNameIdentifier
.	TokenNameDOT
entrySet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
print	TokenNameIdentifier
(	TokenNameLPAREN
isFirst	TokenNameIdentifier
?	TokenNameQUESTION
"   "	TokenNameStringLiteral
:	TokenNameCOLON
" | "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
isFirst	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
entry	TokenNameIdentifier
.	TokenNameDOT
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getRegexEquivalent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
entry	TokenNameIdentifier
.	TokenNameDOT
getKey	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
")"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
