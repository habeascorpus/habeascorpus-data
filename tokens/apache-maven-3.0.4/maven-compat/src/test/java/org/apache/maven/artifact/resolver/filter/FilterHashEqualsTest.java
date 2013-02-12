package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
maven	TokenNameIdentifier
.	TokenNameDOT
artifact	TokenNameIdentifier
.	TokenNameDOT
resolver	TokenNameIdentifier
.	TokenNameDOT
filter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Arrays	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
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
FilterHashEqualsTest	TokenNameIdentifier
extends	TokenNameextends
TestCase	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
void	TokenNamevoid
testIncludesExcludesArtifactFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
List	TokenNameIdentifier
<	TokenNameLESS
String	TokenNameIdentifier
>	TokenNameGREATER
patterns	TokenNameIdentifier
=	TokenNameEQUAL
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
"c"	TokenNameStringLiteral
,	TokenNameCOMMA
"d"	TokenNameStringLiteral
,	TokenNameCOMMA
"e"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IncludesArtifactFilter	TokenNameIdentifier
f1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IncludesArtifactFilter	TokenNameIdentifier
(	TokenNameLPAREN
patterns	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IncludesArtifactFilter	TokenNameIdentifier
f2	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IncludesArtifactFilter	TokenNameIdentifier
(	TokenNameLPAREN
patterns	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
f2	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
f2	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
f2	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
IncludesArtifactFilter	TokenNameIdentifier
f3	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
IncludesArtifactFilter	TokenNameIdentifier
(	TokenNameLPAREN
Arrays	TokenNameIdentifier
.	TokenNameDOT
asList	TokenNameIdentifier
(	TokenNameLPAREN
"d"	TokenNameStringLiteral
,	TokenNameCOMMA
"c"	TokenNameStringLiteral
,	TokenNameCOMMA
"e"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
f3	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
assertTrue	TokenNameIdentifier
(	TokenNameLPAREN
f1	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
f3	TokenNameIdentifier
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE