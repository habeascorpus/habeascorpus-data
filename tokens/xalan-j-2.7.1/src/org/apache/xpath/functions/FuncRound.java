package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
functions	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
XPathContext	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
.	TokenNameDOT
XNumber	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
.	TokenNameDOT
XObject	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FuncRound	TokenNameIdentifier
extends	TokenNameextends
FunctionOneArg	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
7970583902573826611L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
XObject	TokenNameIdentifier
execute	TokenNameIdentifier
(	TokenNameLPAREN
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
javax	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
transform	TokenNameIdentifier
.	TokenNameDOT
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
XObject	TokenNameIdentifier
obj	TokenNameIdentifier
=	TokenNameEQUAL
m_arg0	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
double	TokenNamedouble
val	TokenNameIdentifier
=	TokenNameEQUAL
obj	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
-	TokenNameMINUS
0.5	TokenNameDoubleLiteral
&&	TokenNameAND_AND
val	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
XNumber	TokenNameIdentifier
(	TokenNameLPAREN
-	TokenNameMINUS
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0.0	TokenNameDoubleLiteral
)	TokenNameRPAREN
return	TokenNamereturn
new	TokenNamenew
XNumber	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
new	TokenNamenew
XNumber	TokenNameIdentifier
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
Math	TokenNameIdentifier
.	TokenNameDOT
floor	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
+	TokenNamePLUS
0.5	TokenNameDoubleLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE