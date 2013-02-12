package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
nodes	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
List	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
core	TokenNameIdentifier
.	TokenNameDOT
parser	TokenNameIdentifier
.	TokenNameDOT
EscapeQuerySyntax	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
OrQueryNode	TokenNameIdentifier
extends	TokenNameextends
BooleanQueryNode	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
3692323307688017852L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
OrQueryNode	TokenNameIdentifier
(	TokenNameLPAREN
List	TokenNameIdentifier
<	TokenNameLESS
QueryNode	TokenNameIdentifier
>	TokenNameGREATER
clauses	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
clauses	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
clauses	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
(	TokenNameLPAREN
clauses	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"OR query must have at least one clause"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
"<boolean operation='or'/>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
"<boolean operation='or'>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
QueryNode	TokenNameIdentifier
child	TokenNameIdentifier
:	TokenNameCOLON
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" "	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
child	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
" </boolean>"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
CharSequence	TokenNameIdentifier
toQueryString	TokenNameIdentifier
(	TokenNameLPAREN
EscapeQuerySyntax	TokenNameIdentifier
escapeSyntaxParser	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
||	TokenNameOR_OR
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
StringBuilder	TokenNameIdentifier
sb	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuilder	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
String	TokenNameIdentifier
filler	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
<	TokenNameLESS
QueryNode	TokenNameIdentifier
>	TokenNameGREATER
it	TokenNameIdentifier
=	TokenNameEQUAL
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
it	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
sb	TokenNameIdentifier
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
filler	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
it	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toQueryString	TokenNameIdentifier
(	TokenNameLPAREN
escapeSyntaxParser	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
filler	TokenNameIdentifier
=	TokenNameEQUAL
" OR "	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
getParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
getParent	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
instanceof	TokenNameinstanceof
GroupQueryNode	TokenNameIdentifier
)	TokenNameRPAREN
||	TokenNameOR_OR
isRoot	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
"( "	TokenNameStringLiteral
+	TokenNamePLUS
sb	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" )"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE