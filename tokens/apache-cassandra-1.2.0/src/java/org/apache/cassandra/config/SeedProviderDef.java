package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LinkedHashMap	TokenNameIdentifier
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
SeedProviderDef	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
String	TokenNameIdentifier
class_name	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
parameters	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SeedProviderDef	TokenNameIdentifier
(	TokenNameLPAREN
LinkedHashMap	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
?	TokenNameQUESTION
>	TokenNameGREATER
p	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
class_name	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
p	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"class_name"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
parameters	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
>	TokenNameGREATER
)	TokenNameRPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
List	TokenNameIdentifier
)	TokenNameRPAREN
p	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"parameters"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE