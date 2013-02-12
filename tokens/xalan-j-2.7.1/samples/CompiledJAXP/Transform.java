import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
OutputStreamWriter	TokenNameIdentifier
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
Transform	TokenNameIdentifier
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
{	TokenNameLBRACE
Transform	TokenNameIdentifier
app	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Transform	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
app	TokenNameIdentifier
.	TokenNameDOT
run	TokenNameIdentifier
(	TokenNameLPAREN
args	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
run	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
args	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
xml	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
String	TokenNameIdentifier
transletURI	TokenNameIdentifier
=	TokenNameEQUAL
args	TokenNameIdentifier
[	TokenNameLBRACKET
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
setProperty	TokenNameIdentifier
(	TokenNameLPAREN
"javax.xml.transform.TransformerFactory"	TokenNameStringLiteral
,	TokenNameCOMMA
"org.apache.xalan.xsltc.trax.TransformerFactoryImpl"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
TransformerFactory	TokenNameIdentifier
tf	TokenNameIdentifier
=	TokenNameEQUAL
TransformerFactory	TokenNameIdentifier
.	TokenNameDOT
newInstance	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tf	TokenNameIdentifier
.	TokenNameDOT
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"use-classpath"	TokenNameStringLiteral
,	TokenNameCOMMA
Boolean	TokenNameIdentifier
.	TokenNameDOT
TRUE	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Transformer	TokenNameIdentifier
transformer	TokenNameIdentifier
=	TokenNameEQUAL
tf	TokenNameIdentifier
.	TokenNameDOT
newTransformer	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
StreamSource	TokenNameIdentifier
(	TokenNameLPAREN
transletURI	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StreamSource	TokenNameIdentifier
document	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StreamSource	TokenNameIdentifier
(	TokenNameLPAREN
xml	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
StreamResult	TokenNameIdentifier
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StreamResult	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
OutputStreamWriter	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
transformer	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
(	TokenNameLPAREN
document	TokenNameIdentifier
,	TokenNameCOMMA
result	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Exception: "	TokenNameStringLiteral
+	TokenNamePLUS
e	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
e	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
System	TokenNameIdentifier
.	TokenNameDOT
exit	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
usage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Usage: run <xml_file> <xsl_file>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
exit	TokenNameIdentifier
(	TokenNameLPAREN
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
