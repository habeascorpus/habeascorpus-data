package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ProcessorVersion	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
MAJOR	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
MINOR	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
int	TokenNameint
DELTA	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
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
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"XSLTC version "	TokenNameStringLiteral
+	TokenNamePLUS
MAJOR	TokenNameIdentifier
+	TokenNamePLUS
"."	TokenNameStringLiteral
+	TokenNamePLUS
MINOR	TokenNameIdentifier
+	TokenNamePLUS
(	TokenNameLPAREN
(	TokenNameLPAREN
DELTA	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
(	TokenNameLPAREN
"."	TokenNameStringLiteral
+	TokenNamePLUS
DELTA	TokenNameIdentifier
)	TokenNameRPAREN
:	TokenNameCOLON
(	TokenNameLPAREN
""	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
