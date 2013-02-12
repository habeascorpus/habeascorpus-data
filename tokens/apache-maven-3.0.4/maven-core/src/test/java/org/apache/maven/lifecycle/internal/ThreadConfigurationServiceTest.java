package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
Assert	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
lifecycle	TokenNameIdentifier
.	TokenNameDOT
internal	TokenNameIdentifier
.	TokenNameDOT
stub	TokenNameIdentifier
.	TokenNameDOT
LoggerStub	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ThreadConfigurationServiceTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testGetThreadCount	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
ThreadConfigurationService	TokenNameIdentifier
threadConfigurationService	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ThreadConfigurationService	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
LoggerStub	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
5	TokenNameIntegerLiteral
,	TokenNameCOMMA
threadConfigurationService	TokenNameIdentifier
.	TokenNameDOT
getThreadCount	TokenNameIdentifier
(	TokenNameLPAREN
"1.75"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Assert	TokenNameIdentifier
.	TokenNameDOT
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
6	TokenNameIntegerLiteral
,	TokenNameCOMMA
threadConfigurationService	TokenNameIdentifier
.	TokenNameDOT
getThreadCount	TokenNameIdentifier
(	TokenNameLPAREN
"1.84"	TokenNameStringLiteral
,	TokenNameCOMMA
true	TokenNametrue
,	TokenNameCOMMA
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
.	TokenNameDOT
intValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE