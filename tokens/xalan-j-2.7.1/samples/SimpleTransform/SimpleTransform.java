import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileNotFoundException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
FileOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
Transformer	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerConfigurationException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerFactory	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
stream	TokenNameIdentifier
.	TokenNameDOT
StreamResult	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
stream	TokenNameIdentifier
.	TokenNameDOT
StreamSource	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SimpleTransform	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
main	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
TransformerException	TokenNameIdentifier
,	TokenNameCOMMA
TransformerConfigurationException	TokenNameIdentifier
,	TokenNameCOMMA
FileNotFoundException	TokenNameIdentifier
,	TokenNameCOMMA
IOException	TokenNameIdentifier
{	TokenNameLBRACE
TransformerFactory	TokenNameIdentifier
tFactory	TokenNameIdentifier
=	TokenNameEQUAL
TransformerFactory	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Transformer	TokenNameIdentifier
transformer	TokenNameIdentifier
=	TokenNameEQUAL
tFactory	TokenNameIdentifier
.	TokenNameDOT
newTransformer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StreamSource	TokenNameIdentifier
(	TokenNameLPAREN
"birds.xsl"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StreamSource	TokenNameIdentifier
(	TokenNameLPAREN
"birds.xml"	TokenNameStringLiteral
)	TokenNameRPAREN
,	TokenNameCOMMA
new	TokenNamenew
StreamResult	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
FileOutputStream	TokenNameIdentifier
(	TokenNameLPAREN
"birds.out"	TokenNameStringLiteral
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
"************* The result is in birds.out *************"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
