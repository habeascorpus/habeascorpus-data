package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Properties	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
LuceneTestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
junit	TokenNameIdentifier
.	TokenNameDOT
Test	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TestConfig	TokenNameIdentifier
extends	TokenNameextends
LuceneTestCase	TokenNameIdentifier
{	TokenNameLBRACE
@	TokenNameAT
Test	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
testAbsolutePathNamesWindows	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
Exception	TokenNameIdentifier
{	TokenNameLBRACE
Properties	TokenNameIdentifier
props	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Properties	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"work.dir1"	TokenNameStringLiteral
,	TokenNameCOMMA
"c:\temp"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
props	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"work.dir2"	TokenNameStringLiteral
,	TokenNameCOMMA
"c:/temp"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Config	TokenNameIdentifier
conf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Config	TokenNameIdentifier
(	TokenNameLPAREN
props	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"c:\temp"	TokenNameStringLiteral
,	TokenNameCOMMA
conf	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"work.dir1"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"c:/temp"	TokenNameStringLiteral
,	TokenNameCOMMA
conf	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
"work.dir2"	TokenNameStringLiteral
,	TokenNameCOMMA
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
