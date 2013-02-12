package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
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
config	TokenNameIdentifier
.	TokenNameDOT
AbstractQueryConfig	TokenNameIdentifier
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
config	TokenNameIdentifier
.	TokenNameDOT
ConfigAttribute	TokenNameIdentifier
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
config	TokenNameIdentifier
.	TokenNameDOT
QueryConfigHandler	TokenNameIdentifier
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
standard	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
StandardQueryConfigHandler	TokenNameIdentifier
.	TokenNameDOT
ConfigurationKeys	TokenNameIdentifier
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
standard	TokenNameIdentifier
.	TokenNameDOT
processors	TokenNameIdentifier
.	TokenNameDOT
GroupQueryNodeProcessor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
AttributeImpl	TokenNameIdentifier
;	TokenNameSEMICOLON
@	TokenNameAT
Deprecated	TokenNameIdentifier
public	TokenNamepublic
class	TokenNameclass
DefaultOperatorAttributeImpl	TokenNameIdentifier
extends	TokenNameextends
AttributeImpl	TokenNameIdentifier
implements	TokenNameimplements
DefaultOperatorAttribute	TokenNameIdentifier
,	TokenNameCOMMA
ConfigAttribute	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
6804760312723049526L	TokenNameLongLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
AbstractQueryConfig	TokenNameIdentifier
config	TokenNameIdentifier
;	TokenNameSEMICOLON
{	TokenNameLBRACE
enableBackwards	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
DefaultOperatorAttributeImpl	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setOperator	TokenNameIdentifier
(	TokenNameLPAREN
Operator	TokenNameIdentifier
operator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
operator	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
IllegalArgumentException	TokenNameIdentifier
(	TokenNameLPAREN
"default operator cannot be null!"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
StandardQueryConfigHandler	TokenNameIdentifier
.	TokenNameDOT
Operator	TokenNameIdentifier
newOperator	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
operator	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
Operator	TokenNameIdentifier
.	TokenNameDOT
AND	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
newOperator	TokenNameIdentifier
=	TokenNameEQUAL
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
StandardQueryConfigHandler	TokenNameIdentifier
.	TokenNameDOT
Operator	TokenNameIdentifier
.	TokenNameDOT
AND	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
newOperator	TokenNameIdentifier
=	TokenNameEQUAL
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
StandardQueryConfigHandler	TokenNameIdentifier
.	TokenNameDOT
Operator	TokenNameIdentifier
.	TokenNameDOT
OR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
config	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
ConfigurationKeys	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_OPERATOR	TokenNameIdentifier
,	TokenNameCOMMA
newOperator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Operator	TokenNameIdentifier
getOperator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
StandardQueryConfigHandler	TokenNameIdentifier
.	TokenNameDOT
Operator	TokenNameIdentifier
newOperator	TokenNameIdentifier
=	TokenNameEQUAL
config	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
ConfigurationKeys	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_OPERATOR	TokenNameIdentifier
,	TokenNameCOMMA
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
StandardQueryConfigHandler	TokenNameIdentifier
.	TokenNameDOT
Operator	TokenNameIdentifier
.	TokenNameDOT
OR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
Operator	TokenNameIdentifier
oldOperator	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
newOperator	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
queryParser	TokenNameIdentifier
.	TokenNameDOT
standard	TokenNameIdentifier
.	TokenNameDOT
config	TokenNameIdentifier
.	TokenNameDOT
StandardQueryConfigHandler	TokenNameIdentifier
.	TokenNameDOT
Operator	TokenNameIdentifier
.	TokenNameDOT
AND	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
oldOperator	TokenNameIdentifier
=	TokenNameEQUAL
Operator	TokenNameIdentifier
.	TokenNameDOT
AND	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
oldOperator	TokenNameIdentifier
=	TokenNameEQUAL
Operator	TokenNameIdentifier
.	TokenNameDOT
OR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
oldOperator	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
void	TokenNamevoid
copyTo	TokenNameIdentifier
(	TokenNameLPAREN
AttributeImpl	TokenNameIdentifier
target	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
UnsupportedOperationException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
boolean	TokenNameboolean
equals	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
other	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
other	TokenNameIdentifier
instanceof	TokenNameinstanceof
DefaultOperatorAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DefaultOperatorAttributeImpl	TokenNameIdentifier
defaultOperatorAttr	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DefaultOperatorAttributeImpl	TokenNameIdentifier
)	TokenNameRPAREN
other	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
defaultOperatorAttr	TokenNameIdentifier
.	TokenNameDOT
getOperator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
this	TokenNamethis
.	TokenNameDOT
getOperator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
int	TokenNameint
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getOperator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
hashCode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
*	TokenNameMULTIPLY
31	TokenNameIntegerLiteral
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
"<defaultOperatorAttribute operator="	TokenNameStringLiteral
+	TokenNamePLUS
getOperator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
name	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
+	TokenNamePLUS
"/>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setQueryConfigHandler	TokenNameIdentifier
(	TokenNameLPAREN
AbstractQueryConfig	TokenNameIdentifier
config	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
config	TokenNameIdentifier
=	TokenNameEQUAL
config	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
config	TokenNameIdentifier
.	TokenNameDOT
has	TokenNameIdentifier
(	TokenNameLPAREN
ConfigurationKeys	TokenNameIdentifier
.	TokenNameDOT
DEFAULT_OPERATOR	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
setOperator	TokenNameIdentifier
(	TokenNameLPAREN
Operator	TokenNameIdentifier
.	TokenNameDOT
OR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE