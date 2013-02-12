package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Vector	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xni	TokenNameIdentifier
.	TokenNameDOT
QName	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSConstants	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSObjectList	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSSimpleTypeDefinition	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSTypeDefinition	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
SubstitutionGroupHandler	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
EMPTY_GROUP	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
XSElementDeclHelper	TokenNameIdentifier
fXSElementDeclHelper	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
SubstitutionGroupHandler	TokenNameIdentifier
(	TokenNameLPAREN
XSElementDeclHelper	TokenNameIdentifier
elementDeclHelper	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fXSElementDeclHelper	TokenNameIdentifier
=	TokenNameEQUAL
elementDeclHelper	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
XSElementDecl	TokenNameIdentifier
getMatchingElemDecl	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
XSElementDecl	TokenNameIdentifier
exemplar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
element	TokenNameIdentifier
.	TokenNameDOT
localpart	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
exemplar	TokenNameIdentifier
.	TokenNameDOT
fName	TokenNameIdentifier
&&	TokenNameAND_AND
element	TokenNameIdentifier
.	TokenNameDOT
uri	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
exemplar	TokenNameIdentifier
.	TokenNameDOT
fTargetNamespace	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
exemplar	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
exemplar	TokenNameIdentifier
.	TokenNameDOT
fScope	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
XSConstants	TokenNameIdentifier
.	TokenNameDOT
SCOPE_GLOBAL	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
exemplar	TokenNameIdentifier
.	TokenNameDOT
fBlock	TokenNameIdentifier
&	TokenNameAND
XSConstants	TokenNameIdentifier
.	TokenNameDOT
DERIVATION_SUBSTITUTION	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
XSElementDecl	TokenNameIdentifier
eDecl	TokenNameIdentifier
=	TokenNameEQUAL
fXSElementDeclHelper	TokenNameIdentifier
.	TokenNameDOT
getGlobalElementDecl	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
eDecl	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
substitutionGroupOK	TokenNameIdentifier
(	TokenNameLPAREN
eDecl	TokenNameIdentifier
,	TokenNameCOMMA
exemplar	TokenNameIdentifier
,	TokenNameCOMMA
exemplar	TokenNameIdentifier
.	TokenNameDOT
fBlock	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
eDecl	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
boolean	TokenNameboolean
substitutionGroupOK	TokenNameIdentifier
(	TokenNameLPAREN
XSElementDecl	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
XSElementDecl	TokenNameIdentifier
exemplar	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
blockingConstraint	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
element	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
exemplar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
blockingConstraint	TokenNameIdentifier
&	TokenNameAND
XSConstants	TokenNameIdentifier
.	TokenNameDOT
DERIVATION_SUBSTITUTION	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
XSElementDecl	TokenNameIdentifier
subGroup	TokenNameIdentifier
=	TokenNameEQUAL
element	TokenNameIdentifier
.	TokenNameDOT
fSubGroup	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
subGroup	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
subGroup	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
exemplar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
subGroup	TokenNameIdentifier
=	TokenNameEQUAL
subGroup	TokenNameIdentifier
.	TokenNameDOT
fSubGroup	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
subGroup	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
typeDerivationOK	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
.	TokenNameDOT
fType	TokenNameIdentifier
,	TokenNameCOMMA
exemplar	TokenNameIdentifier
.	TokenNameDOT
fType	TokenNameIdentifier
,	TokenNameCOMMA
blockingConstraint	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
typeDerivationOK	TokenNameIdentifier
(	TokenNameLPAREN
XSTypeDefinition	TokenNameIdentifier
derived	TokenNameIdentifier
,	TokenNameCOMMA
XSTypeDefinition	TokenNameIdentifier
base	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
blockingConstraint	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
short	TokenNameshort
devMethod	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
blockConstraint	TokenNameIdentifier
=	TokenNameEQUAL
blockingConstraint	TokenNameIdentifier
;	TokenNameSEMICOLON
XSTypeDefinition	TokenNameIdentifier
type	TokenNameIdentifier
=	TokenNameEQUAL
derived	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
base	TokenNameIdentifier
&&	TokenNameAND_AND
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
SchemaGrammar	TokenNameIdentifier
.	TokenNameDOT
fAnyType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
getTypeCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
XSTypeDefinition	TokenNameIdentifier
.	TokenNameDOT
COMPLEX_TYPE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
devMethod	TokenNameIdentifier
|=	TokenNameOR_EQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
XSComplexTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
fDerivedBy	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
devMethod	TokenNameIdentifier
|=	TokenNameOR_EQUAL
XSConstants	TokenNameIdentifier
.	TokenNameDOT
DERIVATION_RESTRICTION	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
type	TokenNameIdentifier
=	TokenNameEQUAL
type	TokenNameIdentifier
.	TokenNameDOT
getBaseType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
type	TokenNameIdentifier
=	TokenNameEQUAL
SchemaGrammar	TokenNameIdentifier
.	TokenNameDOT
fAnyType	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
.	TokenNameDOT
getTypeCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
XSTypeDefinition	TokenNameIdentifier
.	TokenNameDOT
COMPLEX_TYPE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
blockConstraint	TokenNameIdentifier
|=	TokenNameOR_EQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
XSComplexTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
type	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
fBlock	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
type	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
base	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
base	TokenNameIdentifier
.	TokenNameDOT
getTypeCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
XSTypeDefinition	TokenNameIdentifier
.	TokenNameDOT
SIMPLE_TYPE	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XSSimpleTypeDefinition	TokenNameIdentifier
st	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XSSimpleTypeDefinition	TokenNameIdentifier
)	TokenNameRPAREN
base	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
st	TokenNameIdentifier
.	TokenNameDOT
getVariety	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
XSSimpleTypeDefinition	TokenNameIdentifier
.	TokenNameDOT
VARIETY_UNION	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XSObjectList	TokenNameIdentifier
memberTypes	TokenNameIdentifier
=	TokenNameEQUAL
st	TokenNameIdentifier
.	TokenNameDOT
getMemberTypes	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
length	TokenNameIdentifier
=	TokenNameEQUAL
memberTypes	TokenNameIdentifier
.	TokenNameDOT
getLength	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
length	TokenNameIdentifier
;	TokenNameSEMICOLON
++	TokenNamePLUS_PLUS
i	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
typeDerivationOK	TokenNameIdentifier
(	TokenNameLPAREN
derived	TokenNameIdentifier
,	TokenNameCOMMA
(	TokenNameLPAREN
XSTypeDefinition	TokenNameIdentifier
)	TokenNameRPAREN
memberTypes	TokenNameIdentifier
.	TokenNameDOT
item	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
,	TokenNameCOMMA
blockingConstraint	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
devMethod	TokenNameIdentifier
&	TokenNameAND
blockConstraint	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
inSubstitutionGroup	TokenNameIdentifier
(	TokenNameLPAREN
XSElementDecl	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
XSElementDecl	TokenNameIdentifier
exemplar	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
substitutionGroupOK	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
exemplar	TokenNameIdentifier
,	TokenNameCOMMA
exemplar	TokenNameIdentifier
.	TokenNameDOT
fBlock	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Hashtable	TokenNameIdentifier
fSubGroupsB	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
OneSubGroup	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
EMPTY_VECTOR	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OneSubGroup	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
Hashtable	TokenNameIdentifier
fSubGroups	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
reset	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
fSubGroupsB	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fSubGroups	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addSubstitutionGroup	TokenNameIdentifier
(	TokenNameLPAREN
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
elements	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XSElementDecl	TokenNameIdentifier
subHead	TokenNameIdentifier
,	TokenNameCOMMA
element	TokenNameIdentifier
;	TokenNameSEMICOLON
Vector	TokenNameIdentifier
subGroup	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
elements	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
element	TokenNameIdentifier
=	TokenNameEQUAL
elements	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
subHead	TokenNameIdentifier
=	TokenNameEQUAL
element	TokenNameIdentifier
.	TokenNameDOT
fSubGroup	TokenNameIdentifier
;	TokenNameSEMICOLON
subGroup	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Vector	TokenNameIdentifier
)	TokenNameRPAREN
fSubGroupsB	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
subHead	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
subGroup	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
subGroup	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
fSubGroupsB	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
subHead	TokenNameIdentifier
,	TokenNameCOMMA
subGroup	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
subGroup	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getSubstitutionGroup	TokenNameIdentifier
(	TokenNameLPAREN
XSElementDecl	TokenNameIdentifier
element	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
subGroup	TokenNameIdentifier
=	TokenNameEQUAL
fSubGroups	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
subGroup	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
(	TokenNameLPAREN
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
subGroup	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
element	TokenNameIdentifier
.	TokenNameDOT
fBlock	TokenNameIdentifier
&	TokenNameAND
XSConstants	TokenNameIdentifier
.	TokenNameDOT
DERIVATION_SUBSTITUTION	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
fSubGroups	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
EMPTY_GROUP	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
EMPTY_GROUP	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
OneSubGroup	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
groupB	TokenNameIdentifier
=	TokenNameEQUAL
getSubGroupB	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
OneSubGroup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
len	TokenNameIdentifier
=	TokenNameEQUAL
groupB	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
,	TokenNameCOMMA
rlen	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
len	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
element	TokenNameIdentifier
.	TokenNameDOT
fBlock	TokenNameIdentifier
&	TokenNameAND
groupB	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
dMethod	TokenNameIdentifier
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
ret	TokenNameIdentifier
[	TokenNameLBRACKET
rlen	TokenNameIdentifier
++	TokenNamePLUS_PLUS
]	TokenNameRBRACKET
=	TokenNameEQUAL
groupB	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
sub	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
rlen	TokenNameIdentifier
<	TokenNameLESS
len	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ret1	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
rlen	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
ret	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
ret1	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
rlen	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ret	TokenNameIdentifier
=	TokenNameEQUAL
ret1	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fSubGroups	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
ret	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
OneSubGroup	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
getSubGroupB	TokenNameIdentifier
(	TokenNameLPAREN
XSElementDecl	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
OneSubGroup	TokenNameIdentifier
methods	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
subGroup	TokenNameIdentifier
=	TokenNameEQUAL
fSubGroupsB	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
subGroup	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
fSubGroupsB	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
EMPTY_VECTOR	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
EMPTY_VECTOR	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
subGroup	TokenNameIdentifier
instanceof	TokenNameinstanceof
OneSubGroup	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
return	TokenNamereturn
(	TokenNameLPAREN
OneSubGroup	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
subGroup	TokenNameIdentifier
;	TokenNameSEMICOLON
Vector	TokenNameIdentifier
group	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
Vector	TokenNameIdentifier
)	TokenNameRPAREN
subGroup	TokenNameIdentifier
,	TokenNameCOMMA
newGroup	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
OneSubGroup	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
group1	TokenNameIdentifier
;	TokenNameSEMICOLON
short	TokenNameshort
dMethod	TokenNameIdentifier
,	TokenNameCOMMA
bMethod	TokenNameIdentifier
,	TokenNameCOMMA
dSubMethod	TokenNameIdentifier
,	TokenNameCOMMA
bSubMethod	TokenNameIdentifier
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
group	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
,	TokenNameCOMMA
j	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
XSElementDecl	TokenNameIdentifier
sub	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XSElementDecl	TokenNameIdentifier
)	TokenNameRPAREN
group	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
getDBMethods	TokenNameIdentifier
(	TokenNameLPAREN
sub	TokenNameIdentifier
.	TokenNameDOT
fType	TokenNameIdentifier
,	TokenNameCOMMA
element	TokenNameIdentifier
.	TokenNameDOT
fType	TokenNameIdentifier
,	TokenNameCOMMA
methods	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
dMethod	TokenNameIdentifier
=	TokenNameEQUAL
methods	TokenNameIdentifier
.	TokenNameDOT
dMethod	TokenNameIdentifier
;	TokenNameSEMICOLON
bMethod	TokenNameIdentifier
=	TokenNameEQUAL
methods	TokenNameIdentifier
.	TokenNameDOT
bMethod	TokenNameIdentifier
;	TokenNameSEMICOLON
newGroup	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
OneSubGroup	TokenNameIdentifier
(	TokenNameLPAREN
sub	TokenNameIdentifier
,	TokenNameCOMMA
methods	TokenNameIdentifier
.	TokenNameDOT
dMethod	TokenNameIdentifier
,	TokenNameCOMMA
methods	TokenNameIdentifier
.	TokenNameDOT
bMethod	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
group1	TokenNameIdentifier
=	TokenNameEQUAL
getSubGroupB	TokenNameIdentifier
(	TokenNameLPAREN
sub	TokenNameIdentifier
,	TokenNameCOMMA
methods	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
j	TokenNameIdentifier
=	TokenNameEQUAL
group1	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
dSubMethod	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
short	TokenNameshort
)	TokenNameRPAREN
(	TokenNameLPAREN
dMethod	TokenNameIdentifier
|	TokenNameOR
group1	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
dMethod	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
bSubMethod	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
short	TokenNameshort
)	TokenNameRPAREN
(	TokenNameLPAREN
bMethod	TokenNameIdentifier
|	TokenNameOR
group1	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
bMethod	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
(	TokenNameLPAREN
dSubMethod	TokenNameIdentifier
&	TokenNameAND
bSubMethod	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
newGroup	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
OneSubGroup	TokenNameIdentifier
(	TokenNameLPAREN
group1	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
sub	TokenNameIdentifier
,	TokenNameCOMMA
dSubMethod	TokenNameIdentifier
,	TokenNameCOMMA
bSubMethod	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
OneSubGroup	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OneSubGroup	TokenNameIdentifier
[	TokenNameLBRACKET
newGroup	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
newGroup	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
--	TokenNameMINUS_MINUS
)	TokenNameRPAREN
{	TokenNameLBRACE
ret	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
(	TokenNameLPAREN
OneSubGroup	TokenNameIdentifier
)	TokenNameRPAREN
newGroup	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
i	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
fSubGroupsB	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
element	TokenNameIdentifier
,	TokenNameCOMMA
ret	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
boolean	TokenNameboolean
getDBMethods	TokenNameIdentifier
(	TokenNameLPAREN
XSTypeDefinition	TokenNameIdentifier
typed	TokenNameIdentifier
,	TokenNameCOMMA
XSTypeDefinition	TokenNameIdentifier
typeb	TokenNameIdentifier
,	TokenNameCOMMA
OneSubGroup	TokenNameIdentifier
methods	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
short	TokenNameshort
dMethod	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
bMethod	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
typed	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
typeb	TokenNameIdentifier
&&	TokenNameAND_AND
typed	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
SchemaGrammar	TokenNameIdentifier
.	TokenNameDOT
fAnyType	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
typed	TokenNameIdentifier
.	TokenNameDOT
getTypeCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
XSTypeDefinition	TokenNameIdentifier
.	TokenNameDOT
COMPLEX_TYPE	TokenNameIdentifier
)	TokenNameRPAREN
dMethod	TokenNameIdentifier
|=	TokenNameOR_EQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
XSComplexTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
typed	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
fDerivedBy	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
dMethod	TokenNameIdentifier
|=	TokenNameOR_EQUAL
XSConstants	TokenNameIdentifier
.	TokenNameDOT
DERIVATION_RESTRICTION	TokenNameIdentifier
;	TokenNameSEMICOLON
typed	TokenNameIdentifier
=	TokenNameEQUAL
typed	TokenNameIdentifier
.	TokenNameDOT
getBaseType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
typed	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
typed	TokenNameIdentifier
=	TokenNameEQUAL
SchemaGrammar	TokenNameIdentifier
.	TokenNameDOT
fAnyType	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
typed	TokenNameIdentifier
.	TokenNameDOT
getTypeCategory	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
XSTypeDefinition	TokenNameIdentifier
.	TokenNameDOT
COMPLEX_TYPE	TokenNameIdentifier
)	TokenNameRPAREN
bMethod	TokenNameIdentifier
|=	TokenNameOR_EQUAL
(	TokenNameLPAREN
(	TokenNameLPAREN
XSComplexTypeDecl	TokenNameIdentifier
)	TokenNameRPAREN
typed	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
fBlock	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
typed	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
typeb	TokenNameIdentifier
||	TokenNameOR_OR
(	TokenNameLPAREN
dMethod	TokenNameIdentifier
&	TokenNameAND
bMethod	TokenNameIdentifier
)	TokenNameRPAREN
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
methods	TokenNameIdentifier
.	TokenNameDOT
dMethod	TokenNameIdentifier
=	TokenNameEQUAL
dMethod	TokenNameIdentifier
;	TokenNameSEMICOLON
methods	TokenNameIdentifier
.	TokenNameDOT
bMethod	TokenNameIdentifier
=	TokenNameEQUAL
bMethod	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
class	TokenNameclass
OneSubGroup	TokenNameIdentifier
{	TokenNameLBRACE
OneSubGroup	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
OneSubGroup	TokenNameIdentifier
(	TokenNameLPAREN
XSElementDecl	TokenNameIdentifier
sub	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
dMethod	TokenNameIdentifier
,	TokenNameCOMMA
short	TokenNameshort
bMethod	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
sub	TokenNameIdentifier
=	TokenNameEQUAL
sub	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
dMethod	TokenNameIdentifier
=	TokenNameEQUAL
dMethod	TokenNameIdentifier
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
bMethod	TokenNameIdentifier
=	TokenNameEQUAL
bMethod	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
XSElementDecl	TokenNameIdentifier
sub	TokenNameIdentifier
;	TokenNameSEMICOLON
short	TokenNameshort
dMethod	TokenNameIdentifier
;	TokenNameSEMICOLON
short	TokenNameshort
bMethod	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE