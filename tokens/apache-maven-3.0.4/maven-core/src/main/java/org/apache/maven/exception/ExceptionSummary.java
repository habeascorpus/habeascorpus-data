package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Collections	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ExceptionSummary	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
message	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
reference	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
List	TokenNameIdentifier
<	TokenNameLESS
ExceptionSummary	TokenNameIdentifier
>	TokenNameGREATER
children	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
ExceptionSummary	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
reference	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
exception	TokenNameIdentifier
,	TokenNameCOMMA
message	TokenNameIdentifier
,	TokenNameCOMMA
reference	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ExceptionSummary	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
reference	TokenNameIdentifier
,	TokenNameCOMMA
List	TokenNameIdentifier
<	TokenNameLESS
ExceptionSummary	TokenNameIdentifier
>	TokenNameGREATER
children	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
exception	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
message	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
message	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
message	TokenNameIdentifier
:	TokenNameCOLON
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
reference	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
reference	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
reference	TokenNameIdentifier
:	TokenNameCOLON
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
children	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
children	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
children	TokenNameIdentifier
:	TokenNameCOLON
Collections	TokenNameIdentifier
.	TokenNameDOT
<	TokenNameLESS
ExceptionSummary	TokenNameIdentifier
>	TokenNameGREATER
emptyList	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Throwable	TokenNameIdentifier
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
message	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getReference	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
reference	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
List	TokenNameIdentifier
<	TokenNameLESS
ExceptionSummary	TokenNameIdentifier
>	TokenNameGREATER
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
children	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
