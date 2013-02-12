package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
project	TokenNameIdentifier
.	TokenNameDOT
path	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
junit	TokenNameIdentifier
.	TokenNameDOT
framework	TokenNameIdentifier
.	TokenNameDOT
TestCase	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
SuppressWarnings	TokenNameIdentifier
(	TokenNameLPAREN
"deprecation"	TokenNameStringLiteral
)	TokenNameRPAREN
public	TokenNamepublic
class	TokenNameclass
DefaultPathTranslatorTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testAlignToBasedirWhereBasedirExpressionIsTheCompleteValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
basedir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"java.io.tmpdir"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
getAbsoluteFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
aligned	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultPathTranslator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
alignToBaseDirectory	TokenNameIdentifier
(	TokenNameLPAREN
"${basedir}"	TokenNameStringLiteral
,	TokenNameCOMMA
basedir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
aligned	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testAlignToBasedirWhereBasedirExpressionIsTheValuePrefix	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
basedir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"java.io.tmpdir"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
getAbsoluteFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
aligned	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultPathTranslator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
alignToBaseDirectory	TokenNameIdentifier
(	TokenNameLPAREN
"${basedir}/dir"	TokenNameStringLiteral
,	TokenNameCOMMA
basedir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
,	TokenNameCOMMA
"dir"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
aligned	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
testUnalignToBasedirWherePathEqualsBasedir	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
File	TokenNameIdentifier
basedir	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
File	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
getProperty	TokenNameIdentifier
(	TokenNameLPAREN
"java.io.tmpdir"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
"test"	TokenNameStringLiteral
)	TokenNameRPAREN
.	TokenNameDOT
getAbsoluteFile	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
unaligned	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
DefaultPathTranslator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
unalignFromBaseDirectory	TokenNameIdentifier
(	TokenNameLPAREN
basedir	TokenNameIdentifier
.	TokenNameDOT
getAbsolutePath	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
basedir	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertEquals	TokenNameIdentifier
(	TokenNameLPAREN
"."	TokenNameStringLiteral
,	TokenNameCOMMA
unaligned	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE