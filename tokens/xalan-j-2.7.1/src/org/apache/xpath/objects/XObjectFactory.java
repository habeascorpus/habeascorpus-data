package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xpath	TokenNameIdentifier
.	TokenNameDOT
objects	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
Axis	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
DTM	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
DTMAxisIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
DTMIterator	TokenNameIdentifier
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
axes	TokenNameIdentifier
.	TokenNameDOT
OneStepIterator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
XObjectFactory	TokenNameIdentifier
{	TokenNameLBRACE
static	TokenNamestatic
public	TokenNamepublic
XObject	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XObject	TokenNameIdentifier
result	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
XObject	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XObject	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XString	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XBoolean	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
Double	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XNumber	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Double	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XObject	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
static	TokenNamestatic
public	TokenNamepublic
XObject	TokenNameIdentifier
create	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
val	TokenNameIdentifier
,	TokenNameCOMMA
XPathContext	TokenNameIdentifier
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
XObject	TokenNameIdentifier
result	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
XObject	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
XObject	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
String	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XString	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
String	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XBoolean	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
Boolean	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
Number	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XNumber	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
(	TokenNameLPAREN
Number	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
DTM	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DTM	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
int	TokenNameint
dtmRoot	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
.	TokenNameDOT
getDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DTMAxisIterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
.	TokenNameDOT
getAxisIterator	TokenNameIdentifier
(	TokenNameLPAREN
Axis	TokenNameIdentifier
.	TokenNameDOT
SELF	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
.	TokenNameDOT
setStartNode	TokenNameIdentifier
(	TokenNameLPAREN
dtmRoot	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
DTMIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OneStepIterator	TokenNameIdentifier
(	TokenNameLPAREN
iter	TokenNameIdentifier
,	TokenNameCOMMA
Axis	TokenNameIdentifier
.	TokenNameDOT
SELF	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iterator	TokenNameIdentifier
.	TokenNameDOT
setRoot	TokenNameIdentifier
(	TokenNameLPAREN
dtmRoot	TokenNameIdentifier
,	TokenNameCOMMA
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XNodeSet	TokenNameIdentifier
(	TokenNameLPAREN
iterator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
DTMAxisIterator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DTMAxisIterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DTMAxisIterator	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
;	TokenNameSEMICOLON
try	TokenNametry
{	TokenNameLBRACE
DTMIterator	TokenNameIdentifier
iterator	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OneStepIterator	TokenNameIdentifier
(	TokenNameLPAREN
iter	TokenNameIdentifier
,	TokenNameCOMMA
Axis	TokenNameIdentifier
.	TokenNameDOT
SELF	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iterator	TokenNameIdentifier
.	TokenNameDOT
setRoot	TokenNameIdentifier
(	TokenNameLPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
getStartNode	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XNodeSet	TokenNameIdentifier
(	TokenNameLPAREN
iterator	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
Exception	TokenNameIdentifier
ex	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
utils	TokenNameIdentifier
.	TokenNameDOT
WrappedRuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
ex	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
DTMIterator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XNodeSet	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
DTMIterator	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
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
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XNodeSetForDOM	TokenNameIdentifier
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
val	TokenNameIdentifier
,	TokenNameCOMMA
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
NodeList	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XNodeSetForDOM	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
NodeList	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
,	TokenNameCOMMA
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
val	TokenNameIdentifier
instanceof	TokenNameinstanceof
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
traversal	TokenNameIdentifier
.	TokenNameDOT
NodeIterator	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XNodeSetForDOM	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
traversal	TokenNameIdentifier
.	TokenNameDOT
NodeIterator	TokenNameIdentifier
)	TokenNameRPAREN
val	TokenNameIdentifier
,	TokenNameCOMMA
xctxt	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
result	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
XObject	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
result	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE