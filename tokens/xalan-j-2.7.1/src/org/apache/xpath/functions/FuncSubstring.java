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
xalan	TokenNameIdentifier
.	TokenNameDOT
res	TokenNameIdentifier
.	TokenNameDOT
XSLMessages	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
XMLString	TokenNameIdentifier
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
XObject	TokenNameIdentifier
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
XString	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
res	TokenNameIdentifier
.	TokenNameDOT
XPATHErrorResources	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FuncSubstring	TokenNameIdentifier
extends	TokenNameextends
Function3Args	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
5996676095024715502L	TokenNameLongLiteral
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
XMLString	TokenNameIdentifier
s1	TokenNameIdentifier
=	TokenNameEQUAL
m_arg0	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
xstr	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
double	TokenNamedouble
start	TokenNameIdentifier
=	TokenNameEQUAL
m_arg1	TokenNameIdentifier
.	TokenNameDOT
execute	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
lenOfS1	TokenNameIdentifier
=	TokenNameEQUAL
s1	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
XMLString	TokenNameIdentifier
substr	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
lenOfS1	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
XString	TokenNameIdentifier
.	TokenNameDOT
EMPTYSTRING	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
{	TokenNameLBRACE
int	TokenNameint
startIndex	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
Double	TokenNameIdentifier
.	TokenNameDOT
isNaN	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
start	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1000000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
startIndex	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
start	TokenNameIdentifier
=	TokenNameEQUAL
Math	TokenNameIdentifier
.	TokenNameDOT
round	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
startIndex	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
start	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
?	TokenNameQUESTION
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
start	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
:	TokenNameCOLON
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
m_arg2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
double	TokenNamedouble
len	TokenNameIdentifier
=	TokenNameEQUAL
m_arg2	TokenNameIdentifier
.	TokenNameDOT
num	TokenNameIdentifier
(	TokenNameLPAREN
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
end	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
int	TokenNameint
)	TokenNameRPAREN
(	TokenNameLPAREN
Math	TokenNameIdentifier
.	TokenNameDOT
round	TokenNameIdentifier
(	TokenNameLPAREN
len	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
start	TokenNameIdentifier
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
end	TokenNameIdentifier
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
end	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
end	TokenNameIdentifier
>	TokenNameGREATER
lenOfS1	TokenNameIdentifier
)	TokenNameRPAREN
end	TokenNameIdentifier
=	TokenNameEQUAL
lenOfS1	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
>	TokenNameGREATER
lenOfS1	TokenNameIdentifier
)	TokenNameRPAREN
startIndex	TokenNameIdentifier
=	TokenNameEQUAL
lenOfS1	TokenNameIdentifier
;	TokenNameSEMICOLON
substr	TokenNameIdentifier
=	TokenNameEQUAL
s1	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
,	TokenNameCOMMA
end	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
>	TokenNameGREATER
lenOfS1	TokenNameIdentifier
)	TokenNameRPAREN
startIndex	TokenNameIdentifier
=	TokenNameEQUAL
lenOfS1	TokenNameIdentifier
;	TokenNameSEMICOLON
substr	TokenNameIdentifier
=	TokenNameEQUAL
s1	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
startIndex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
XString	TokenNameIdentifier
)	TokenNameRPAREN
substr	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
checkNumberArgs	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
argNum	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
WrongNumberArgsException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
argNum	TokenNameIdentifier
<	TokenNameLESS
2	TokenNameIntegerLiteral
)	TokenNameRPAREN
reportWrongNumberArgs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
void	TokenNamevoid
reportWrongNumberArgs	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
WrongNumberArgsException	TokenNameIdentifier
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
WrongNumberArgsException	TokenNameIdentifier
(	TokenNameLPAREN
XSLMessages	TokenNameIdentifier
.	TokenNameDOT
createXPATHMessage	TokenNameIdentifier
(	TokenNameLPAREN
XPATHErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_TWO_OR_THREE	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
