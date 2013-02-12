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
.	TokenNameDOT
models	TokenNameIdentifier
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
impl	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
SubstitutionGroupHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XMLSchemaException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSConstraints	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xerces	TokenNameIdentifier
.	TokenNameDOT
impl	TokenNameIdentifier
.	TokenNameDOT
xs	TokenNameIdentifier
.	TokenNameDOT
XSElementDecl	TokenNameIdentifier
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
public	TokenNamepublic
class	TokenNameclass
XSAllCM	TokenNameIdentifier
implements	TokenNameimplements
XSCMValidator	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
STATE_START	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
STATE_VALID	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
short	TokenNameshort
STATE_CHILD	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
XSElementDecl	TokenNameIdentifier
fAllElements	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
fIsOptionalElement	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
private	TokenNameprivate
final	TokenNamefinal
boolean	TokenNameboolean
fHasOptionalContent	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
int	TokenNameint
fNumElements	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
XSAllCM	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
hasOptionalContent	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
size	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fHasOptionalContent	TokenNameIdentifier
=	TokenNameEQUAL
hasOptionalContent	TokenNameIdentifier
;	TokenNameSEMICOLON
fAllElements	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XSElementDecl	TokenNameIdentifier
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
fIsOptionalElement	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
boolean	TokenNameboolean
[	TokenNameLBRACKET
size	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
addElement	TokenNameIdentifier
(	TokenNameLPAREN
XSElementDecl	TokenNameIdentifier
element	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
isOptional	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
fAllElements	TokenNameIdentifier
[	TokenNameLBRACKET
fNumElements	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
element	TokenNameIdentifier
;	TokenNameSEMICOLON
fIsOptionalElement	TokenNameIdentifier
[	TokenNameLBRACKET
fNumElements	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
isOptional	TokenNameIdentifier
;	TokenNameSEMICOLON
fNumElements	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
startContentModel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
state	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
fNumElements	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
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
<=	TokenNameLESS_EQUAL
fNumElements	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
state	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
STATE_START	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
state	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Object	TokenNameIdentifier
findMatchingDecl	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
elementName	TokenNameIdentifier
,	TokenNameCOMMA
SubstitutionGroupHandler	TokenNameIdentifier
subGroupHandler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Object	TokenNameIdentifier
matchingDecl	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
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
fNumElements	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
matchingDecl	TokenNameIdentifier
=	TokenNameEQUAL
subGroupHandler	TokenNameIdentifier
.	TokenNameDOT
getMatchingElemDecl	TokenNameIdentifier
(	TokenNameLPAREN
elementName	TokenNameIdentifier
,	TokenNameCOMMA
fAllElements	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
matchingDecl	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
matchingDecl	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Object	TokenNameIdentifier
oneTransition	TokenNameIdentifier
(	TokenNameLPAREN
QName	TokenNameIdentifier
elementName	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
currentState	TokenNameIdentifier
,	TokenNameCOMMA
SubstitutionGroupHandler	TokenNameIdentifier
subGroupHandler	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
currentState	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
<	TokenNameLESS
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
currentState	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
XSCMValidator	TokenNameIdentifier
.	TokenNameDOT
SUBSEQUENT_ERROR	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
findMatchingDecl	TokenNameIdentifier
(	TokenNameLPAREN
elementName	TokenNameIdentifier
,	TokenNameCOMMA
subGroupHandler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
currentState	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
STATE_CHILD	TokenNameIdentifier
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
matchingDecl	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
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
fNumElements	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
currentState	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
!=	TokenNameNOT_EQUAL
STATE_START	TokenNameIdentifier
)	TokenNameRPAREN
continue	TokenNamecontinue
;	TokenNameSEMICOLON
matchingDecl	TokenNameIdentifier
=	TokenNameEQUAL
subGroupHandler	TokenNameIdentifier
.	TokenNameDOT
getMatchingElemDecl	TokenNameIdentifier
(	TokenNameLPAREN
elementName	TokenNameIdentifier
,	TokenNameCOMMA
fAllElements	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
matchingDecl	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
currentState	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
STATE_VALID	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
matchingDecl	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
currentState	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
XSCMValidator	TokenNameIdentifier
.	TokenNameDOT
FIRST_ERROR	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
findMatchingDecl	TokenNameIdentifier
(	TokenNameLPAREN
elementName	TokenNameIdentifier
,	TokenNameCOMMA
subGroupHandler	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
endContentModel	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
currentState	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
state	TokenNameIdentifier
=	TokenNameEQUAL
currentState	TokenNameIdentifier
[	TokenNameLBRACKET
0	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
state	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XSCMValidator	TokenNameIdentifier
.	TokenNameDOT
FIRST_ERROR	TokenNameIdentifier
||	TokenNameOR_OR
state	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
XSCMValidator	TokenNameIdentifier
.	TokenNameDOT
SUBSEQUENT_ERROR	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
fHasOptionalContent	TokenNameIdentifier
&&	TokenNameAND_AND
state	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
STATE_START	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
true	TokenNametrue
;	TokenNameSEMICOLON
}	TokenNameRBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
fNumElements	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
fIsOptionalElement	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
&&	TokenNameAND_AND
currentState	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
STATE_START	TokenNameIdentifier
)	TokenNameRPAREN
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
checkUniqueParticleAttribution	TokenNameIdentifier
(	TokenNameLPAREN
SubstitutionGroupHandler	TokenNameIdentifier
subGroupHandler	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
XMLSchemaException	TokenNameIdentifier
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
i	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
i	TokenNameIdentifier
<	TokenNameLESS
fNumElements	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
int	TokenNameint
j	TokenNameIdentifier
=	TokenNameEQUAL
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
j	TokenNameIdentifier
<	TokenNameLESS
fNumElements	TokenNameIdentifier
;	TokenNameSEMICOLON
j	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
XSConstraints	TokenNameIdentifier
.	TokenNameDOT
overlapUPA	TokenNameIdentifier
(	TokenNameLPAREN
fAllElements	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
fAllElements	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
,	TokenNameCOMMA
subGroupHandler	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
XMLSchemaException	TokenNameIdentifier
(	TokenNameLPAREN
"cos-nonambig"	TokenNameStringLiteral
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
fAllElements	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
fAllElements	TokenNameIdentifier
[	TokenNameLBRACKET
j	TokenNameIdentifier
]	TokenNameRBRACKET
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Vector	TokenNameIdentifier
whatCanGoHere	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
state	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Vector	TokenNameIdentifier
ret	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Vector	TokenNameIdentifier
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
fNumElements	TokenNameIdentifier
;	TokenNameSEMICOLON
i	TokenNameIdentifier
++	TokenNamePLUS_PLUS
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
state	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
==	TokenNameEQUAL_EQUAL
STATE_START	TokenNameIdentifier
)	TokenNameRPAREN
ret	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
fAllElements	TokenNameIdentifier
[	TokenNameLBRACKET
i	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
ret	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
occurenceInfo	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
state	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getTermName	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
termId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isCompactedForUPA	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE