package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Reader	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Map	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
model	TokenNameIdentifier
.	TokenNameDOT
Model	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
interface	TokenNameinterface
ModelReader	TokenNameIdentifier
{	TokenNameLBRACE
String	TokenNameIdentifier
IS_STRICT	TokenNameIdentifier
=	TokenNameEQUAL
"org.apache.maven.model.io.isStrict"	TokenNameStringLiteral
;	TokenNameSEMICOLON
String	TokenNameIdentifier
INPUT_SOURCE	TokenNameIdentifier
=	TokenNameEQUAL
"org.apache.maven.model.io.inputSource"	TokenNameStringLiteral
;	TokenNameSEMICOLON
Model	TokenNameIdentifier
read	TokenNameIdentifier
(	TokenNameLPAREN
File	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
?	TokenNameQUESTION
>	TokenNameGREATER
options	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ModelParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
Model	TokenNameIdentifier
read	TokenNameIdentifier
(	TokenNameLPAREN
Reader	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
?	TokenNameQUESTION
>	TokenNameGREATER
options	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ModelParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
Model	TokenNameIdentifier
read	TokenNameIdentifier
(	TokenNameLPAREN
InputStream	TokenNameIdentifier
input	TokenNameIdentifier
,	TokenNameCOMMA
Map	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
,	TokenNameCOMMA
?	TokenNameQUESTION
>	TokenNameGREATER
options	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ModelParseException	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
