package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
compiler	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
compiler	TokenNameIdentifier
.	TokenNameDOT
SyntaxTreeNode	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TypeCheckError	TokenNameIdentifier
extends	TokenNameextends
Exception	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
3246224233917854640L	TokenNameLongLiteral
;	TokenNameSEMICOLON
ErrorMsg	TokenNameIdentifier
_error	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
SyntaxTreeNode	TokenNameIdentifier
_node	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
public	TokenNamepublic
TypeCheckError	TokenNameIdentifier
(	TokenNameLPAREN
SyntaxTreeNode	TokenNameIdentifier
node	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_node	TokenNameIdentifier
=	TokenNameEQUAL
node	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TypeCheckError	TokenNameIdentifier
(	TokenNameLPAREN
ErrorMsg	TokenNameIdentifier
error	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_error	TokenNameIdentifier
=	TokenNameEQUAL
error	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TypeCheckError	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
code	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
param	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_error	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ErrorMsg	TokenNameIdentifier
(	TokenNameLPAREN
code	TokenNameIdentifier
,	TokenNameCOMMA
param	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
TypeCheckError	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
code	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
param1	TokenNameIdentifier
,	TokenNameCOMMA
Object	TokenNameIdentifier
param2	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
_error	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ErrorMsg	TokenNameIdentifier
(	TokenNameLPAREN
code	TokenNameIdentifier
,	TokenNameCOMMA
param1	TokenNameIdentifier
,	TokenNameCOMMA
param2	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ErrorMsg	TokenNameIdentifier
getErrorMsg	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
_error	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getMessage	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
result	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
_error	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_node	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
_error	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ErrorMsg	TokenNameIdentifier
(	TokenNameLPAREN
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_ERR	TokenNameIdentifier
,	TokenNameCOMMA
_node	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
_error	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ErrorMsg	TokenNameIdentifier
(	TokenNameLPAREN
ErrorMsg	TokenNameIdentifier
.	TokenNameDOT
TYPE_CHECK_UNK_LOC_ERR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
_error	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE