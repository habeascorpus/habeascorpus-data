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
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
messages	TokenNameIdentifier
.	TokenNameDOT
MessageImpl	TokenNameIdentifier
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
QueryNodeError	TokenNameIdentifier
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
messages	TokenNameIdentifier
.	TokenNameDOT
QueryParserMessages	TokenNameIdentifier
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
SlopQueryNode	TokenNameIdentifier
extends	TokenNameextends
QueryNodeImpl	TokenNameIdentifier
implements	TokenNameimplements
FieldableNode	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
0L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
value	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
SlopQueryNode	TokenNameIdentifier
(	TokenNameLPAREN
QueryNode	TokenNameIdentifier
query	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
query	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
QueryNodeError	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
MessageImpl	TokenNameIdentifier
(	TokenNameLPAREN
QueryParserMessages	TokenNameIdentifier
.	TokenNameDOT
NODE_ACTION_NOT_SUPPORTED	TokenNameIdentifier
,	TokenNameCOMMA
"query"	TokenNameStringLiteral
,	TokenNameCOMMA
"null"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
setLeaf	TokenNameIdentifier
(	TokenNameLPAREN
false	TokenNamefalse
)	TokenNameRPAREN
;	TokenNameSEMICOLON
allocate	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
add	TokenNameIdentifier
(	TokenNameLPAREN
query	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
QueryNode	TokenNameIdentifier
getChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getChildren	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
CharSequence	TokenNameIdentifier
getValueString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
Float	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
Float	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
f	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
f	TokenNameIdentifier
.	TokenNameDOT
longValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
""	TokenNameStringLiteral
+	TokenNamePLUS
f	TokenNameIdentifier
.	TokenNameDOT
longValue	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
return	TokenNamereturn
""	TokenNameStringLiteral
+	TokenNamePLUS
f	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
String	TokenNameIdentifier
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
"<slop value='"	TokenNameStringLiteral
+	TokenNamePLUS
getValueString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"'>"	TokenNameStringLiteral
+	TokenNamePLUS
" "	TokenNameStringLiteral
+	TokenNamePLUS
getChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
" </slop>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
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
getChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
return	TokenNamereturn
getChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
toQueryString	TokenNameIdentifier
(	TokenNameLPAREN
escapeSyntaxParser	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
"~"	TokenNameStringLiteral
+	TokenNamePLUS
getValueString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
QueryNode	TokenNameIdentifier
cloneTree	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
CloneNotSupportedException	TokenNameIdentifier
{	TokenNameLBRACE
SlopQueryNode	TokenNameIdentifier
clone	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
SlopQueryNode	TokenNameIdentifier
)	TokenNameRPAREN
super	TokenNamesuper
.	TokenNameDOT
cloneTree	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clone	TokenNameIdentifier
.	TokenNameDOT
value	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
value	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
clone	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
CharSequence	TokenNameIdentifier
getField	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
QueryNode	TokenNameIdentifier
child	TokenNameIdentifier
=	TokenNameEQUAL
getChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
child	TokenNameIdentifier
instanceof	TokenNameinstanceof
FieldableNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
FieldableNode	TokenNameIdentifier
)	TokenNameRPAREN
child	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
getField	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setField	TokenNameIdentifier
(	TokenNameLPAREN
CharSequence	TokenNameIdentifier
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
QueryNode	TokenNameIdentifier
child	TokenNameIdentifier
=	TokenNameEQUAL
getChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
child	TokenNameIdentifier
instanceof	TokenNameinstanceof
FieldableNode	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
(	TokenNameLPAREN
(	TokenNameLPAREN
FieldableNode	TokenNameIdentifier
)	TokenNameRPAREN
child	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
setField	TokenNameIdentifier
(	TokenNameLPAREN
fieldName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
