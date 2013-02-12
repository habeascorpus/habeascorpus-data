package	TokenNamepackage
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
facade	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FacadeTaskHelperTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
FacadeTaskHelperTest	TokenNameIdentifier
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
testPrecedenceRules	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
FacadeTaskHelper	TokenNameIdentifier
fth	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FacadeTaskHelper	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
fth	TokenNameIdentifier
.	TokenNameDOT
getImplementation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
.	TokenNameDOT
setMagicValue	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
fth	TokenNameIdentifier
.	TokenNameDOT
getImplementation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FacadeTaskHelper	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
"bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
,	TokenNameCOMMA
fth	TokenNameIdentifier
.	TokenNameDOT
getImplementation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FacadeTaskHelper	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
,	TokenNameCOMMA
fth	TokenNameIdentifier
.	TokenNameDOT
getImplementation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FacadeTaskHelper	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
.	TokenNameDOT
setMagicValue	TokenNameIdentifier
(	TokenNameLPAREN
"bar"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
.	TokenNameDOT
setImplementation	TokenNameIdentifier
(	TokenNameLPAREN
"baz"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"baz"	TokenNameStringLiteral
,	TokenNameCOMMA
fth	TokenNameIdentifier
.	TokenNameDOT
getImplementation	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testHasBeenSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
FacadeTaskHelper	TokenNameIdentifier
fth	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
FacadeTaskHelper	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"nothing set"	TokenNameStringLiteral
,	TokenNameCOMMA
!	TokenNameNOT
fth	TokenNameIdentifier
.	TokenNameDOT
hasBeenSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
.	TokenNameDOT
setMagicValue	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"magic has not been set"	TokenNameStringLiteral
,	TokenNameCOMMA
!	TokenNameNOT
fth	TokenNameIdentifier
.	TokenNameDOT
hasBeenSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
.	TokenNameDOT
setMagicValue	TokenNameIdentifier
(	TokenNameLPAREN
"foo"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"magic has been set"	TokenNameStringLiteral
,	TokenNameCOMMA
fth	TokenNameIdentifier
.	TokenNameDOT
hasBeenSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
.	TokenNameDOT
setMagicValue	TokenNameIdentifier
(	TokenNameLPAREN
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
!	TokenNameNOT
fth	TokenNameIdentifier
.	TokenNameDOT
hasBeenSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fth	TokenNameIdentifier
.	TokenNameDOT
setImplementation	TokenNameIdentifier
(	TokenNameLPAREN
"baz"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
"set explicitly"	TokenNameStringLiteral
,	TokenNameCOMMA
fth	TokenNameIdentifier
.	TokenNameDOT
hasBeenSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE