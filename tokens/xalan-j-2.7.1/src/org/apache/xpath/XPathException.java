package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
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
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XPathException	TokenNameIdentifier
extends	TokenNameextends
TransformerException	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
4263549717619045963L	TokenNameLongLiteral
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
m_styleNode	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
Object	TokenNameIdentifier
getStylesheetNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_styleNode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setStylesheetNode	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
styleNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_styleNode	TokenNameIdentifier
=	TokenNameEQUAL
styleNode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
Exception	TokenNameIdentifier
m_exception	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
XPathException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
ExpressionNode	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
setLocator	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setStylesheetNode	TokenNameIdentifier
(	TokenNameLPAREN
getStylesheetNode	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XPathException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
getStylesheetNode	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionNode	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ExpressionNode	TokenNameIdentifier
owner	TokenNameIdentifier
=	TokenNameEQUAL
getExpressionOwner	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
owner	TokenNameIdentifier
&&	TokenNameAND_AND
owner	TokenNameIdentifier
instanceof	TokenNameinstanceof
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
Node	TokenNameIdentifier
)	TokenNameRPAREN
owner	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
ExpressionNode	TokenNameIdentifier
getExpressionOwner	TokenNameIdentifier
(	TokenNameLPAREN
ExpressionNode	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ExpressionNode	TokenNameIdentifier
parent	TokenNameIdentifier
=	TokenNameEQUAL
ex	TokenNameIdentifier
.	TokenNameDOT
exprGetParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
parent	TokenNameIdentifier
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
parent	TokenNameIdentifier
instanceof	TokenNameinstanceof
Expression	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
parent	TokenNameIdentifier
=	TokenNameEQUAL
parent	TokenNameIdentifier
.	TokenNameDOT
exprGetParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
parent	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XPathException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
styleNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_styleNode	TokenNameIdentifier
=	TokenNameEQUAL
styleNode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XPathException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
Node	TokenNameIdentifier
styleNode	TokenNameIdentifier
,	TokenNameCOMMA
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_styleNode	TokenNameIdentifier
=	TokenNameEQUAL
styleNode	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
m_exception	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XPathException	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
message	TokenNameIdentifier
,	TokenNameCOMMA
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
message	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
m_exception	TokenNameIdentifier
=	TokenNameEQUAL
e	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintStream	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
s	TokenNameIdentifier
=	TokenNameEQUAL
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
=	TokenNameEQUAL
m_exception	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
exception	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"---------"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
exception	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
TransformerException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TransformerException	TokenNameIdentifier
se	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
)	TokenNameRPAREN
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
Throwable	TokenNameIdentifier
prev	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
exception	TokenNameIdentifier
=	TokenNameEQUAL
se	TokenNameIdentifier
.	TokenNameDOT
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prev	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
exception	TokenNameIdentifier
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
exception	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
lastMessage	TokenNameIdentifier
=	TokenNameEQUAL
super	TokenNamesuper
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
=	TokenNameEQUAL
m_exception	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
exception	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
nextMessage	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
.	TokenNameDOT
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
nextMessage	TokenNameIdentifier
)	TokenNameRPAREN
lastMessage	TokenNameIdentifier
=	TokenNameEQUAL
nextMessage	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
TransformerException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TransformerException	TokenNameIdentifier
se	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
)	TokenNameRPAREN
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
Throwable	TokenNameIdentifier
prev	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
exception	TokenNameIdentifier
=	TokenNameEQUAL
se	TokenNameIdentifier
.	TokenNameDOT
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prev	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
exception	TokenNameIdentifier
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
exception	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
lastMessage	TokenNameIdentifier
)	TokenNameRPAREN
?	TokenNameQUESTION
lastMessage	TokenNameIdentifier
:	TokenNameCOLON
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintWriter	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
s	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
PrintWriter	TokenNameIdentifier
(	TokenNameLPAREN
System	TokenNameIdentifier
.	TokenNameDOT
err	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
super	TokenNamesuper
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
boolean	TokenNameboolean
isJdk14OrHigher	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
Throwable	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
.	TokenNameDOT
getMethod	TokenNameIdentifier
(	TokenNameLPAREN
"getCause"	TokenNameStringLiteral
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
isJdk14OrHigher	TokenNameIdentifier
=	TokenNameEQUAL
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
NoSuchMethodException	TokenNameIdentifier
nsme	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isJdk14OrHigher	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Throwable	TokenNameIdentifier
exception	TokenNameIdentifier
=	TokenNameEQUAL
m_exception	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
(	TokenNameLPAREN
i	TokenNameIdentifier
<	TokenNameLESS
10	TokenNameIntegerLiteral
)	TokenNameRPAREN
&&	TokenNameAND_AND
(	TokenNameLPAREN
null	TokenNamenull
!=	TokenNameNOT_EQUAL
exception	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"---------"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
exception	TokenNameIdentifier
.	TokenNameDOT
printStackTrace	TokenNameIdentifier
(	TokenNameLPAREN
s	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"Could not print stack trace..."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
exception	TokenNameIdentifier
instanceof	TokenNameinstanceof
TransformerException	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
TransformerException	TokenNameIdentifier
se	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
TransformerException	TokenNameIdentifier
)	TokenNameRPAREN
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
Throwable	TokenNameIdentifier
prev	TokenNameIdentifier
=	TokenNameEQUAL
exception	TokenNameIdentifier
;	TokenNameSEMICOLON
exception	TokenNameIdentifier
=	TokenNameEQUAL
se	TokenNameIdentifier
.	TokenNameDOT
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
prev	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
exception	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
exception	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
exception	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
Throwable	TokenNameIdentifier
getException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_exception	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
