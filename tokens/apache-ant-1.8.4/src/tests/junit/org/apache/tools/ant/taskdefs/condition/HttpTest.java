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
condition	TokenNameIdentifier
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
BuildFileTest	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
HttpTest	TokenNameIdentifier
extends	TokenNameextends
BuildFileTest	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
HttpTest	TokenNameIdentifier
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
void	TokenNamevoid
setUp	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
configureProject	TokenNameIdentifier
(	TokenNameLPAREN
"src/etc/testcases/taskdefs/conditions/http.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testNoMethod	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectPropertySet	TokenNameIdentifier
(	TokenNameLPAREN
"basic-no-method"	TokenNameStringLiteral
,	TokenNameCOMMA
"basic-no-method"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyUnset	TokenNameIdentifier
(	TokenNameLPAREN
"basic-no-method-bad-url"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testHeadRequest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectPropertySet	TokenNameIdentifier
(	TokenNameLPAREN
"test-head-request"	TokenNameStringLiteral
,	TokenNameCOMMA
"test-head-request"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyUnset	TokenNameIdentifier
(	TokenNameLPAREN
"test-head-request-bad-url"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testGetRequest	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectPropertySet	TokenNameIdentifier
(	TokenNameLPAREN
"test-get-request"	TokenNameStringLiteral
,	TokenNameCOMMA
"test-get-request"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertPropertyUnset	TokenNameIdentifier
(	TokenNameLPAREN
"test-get-request-bad-url"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testBadRequestMethod	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
expectSpecificBuildException	TokenNameIdentifier
(	TokenNameLPAREN
"bad-request-method"	TokenNameStringLiteral
,	TokenNameCOMMA
"invalid HTTP request method specified"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
