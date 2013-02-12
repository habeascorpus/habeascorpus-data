package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xalan	TokenNameIdentifier
.	TokenNameDOT
xsltc	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
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
DOM	TokenNameIdentifier
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
DOMEnhancedForDTM	TokenNameIdentifier
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
StripFilter	TokenNameIdentifier
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
runtime	TokenNameIdentifier
.	TokenNameDOT
AbstractTranslet	TokenNameIdentifier
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
runtime	TokenNameIdentifier
.	TokenNameDOT
Hashtable	TokenNameIdentifier
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
DTMWSFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
DOMWSFilter	TokenNameIdentifier
implements	TokenNameimplements
DTMWSFilter	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
AbstractTranslet	TokenNameIdentifier
m_translet	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
StripFilter	TokenNameIdentifier
m_filter	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
Hashtable	TokenNameIdentifier
m_mappings	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
DTM	TokenNameIdentifier
m_currentDTM	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
m_currentMapping	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
DOMWSFilter	TokenNameIdentifier
(	TokenNameLPAREN
AbstractTranslet	TokenNameIdentifier
translet	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_translet	TokenNameIdentifier
=	TokenNameEQUAL
translet	TokenNameIdentifier
;	TokenNameSEMICOLON
m_mappings	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Hashtable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
translet	TokenNameIdentifier
instanceof	TokenNameinstanceof
StripFilter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_filter	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
StripFilter	TokenNameIdentifier
)	TokenNameRPAREN
translet	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
short	TokenNameshort
getShouldStripSpace	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
node	TokenNameIdentifier
,	TokenNameCOMMA
DTM	TokenNameIdentifier
dtm	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_filter	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
dtm	TokenNameIdentifier
instanceof	TokenNameinstanceof
DOM	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DOM	TokenNameIdentifier
dom	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DOM	TokenNameIdentifier
)	TokenNameRPAREN
dtm	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
type	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dtm	TokenNameIdentifier
instanceof	TokenNameinstanceof
DOMEnhancedForDTM	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
DOMEnhancedForDTM	TokenNameIdentifier
mappableDOM	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
DOMEnhancedForDTM	TokenNameIdentifier
)	TokenNameRPAREN
dtm	TokenNameIdentifier
;	TokenNameSEMICOLON
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
mapping	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dtm	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
m_currentDTM	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
mapping	TokenNameIdentifier
=	TokenNameEQUAL
m_currentMapping	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
mapping	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
short	TokenNameshort
[	TokenNameLBRACKET
]	TokenNameRBRACKET
)	TokenNameRPAREN
m_mappings	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
dtm	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
mapping	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
mapping	TokenNameIdentifier
=	TokenNameEQUAL
mappableDOM	TokenNameIdentifier
.	TokenNameDOT
getMapping	TokenNameIdentifier
(	TokenNameLPAREN
m_translet	TokenNameIdentifier
.	TokenNameDOT
getNamesArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
m_translet	TokenNameIdentifier
.	TokenNameDOT
getUrisArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
m_translet	TokenNameIdentifier
.	TokenNameDOT
getTypesArray	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_mappings	TokenNameIdentifier
.	TokenNameDOT
put	TokenNameIdentifier
(	TokenNameLPAREN
dtm	TokenNameIdentifier
,	TokenNameCOMMA
mapping	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_currentDTM	TokenNameIdentifier
=	TokenNameEQUAL
dtm	TokenNameIdentifier
;	TokenNameSEMICOLON
m_currentMapping	TokenNameIdentifier
=	TokenNameEQUAL
mapping	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
expType	TokenNameIdentifier
=	TokenNameEQUAL
mappableDOM	TokenNameIdentifier
.	TokenNameDOT
getExpandedTypeID	TokenNameIdentifier
(	TokenNameLPAREN
node	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
expType	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
&&	TokenNameAND_AND
expType	TokenNameIdentifier
<	TokenNameLESS
mapping	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
)	TokenNameRPAREN
type	TokenNameIdentifier
=	TokenNameEQUAL
mapping	TokenNameIdentifier
[	TokenNameLBRACKET
expType	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
else	TokenNameelse
type	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
INHERIT	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
m_filter	TokenNameIdentifier
.	TokenNameDOT
stripSpace	TokenNameIdentifier
(	TokenNameLPAREN
dom	TokenNameIdentifier
,	TokenNameCOMMA
node	TokenNameIdentifier
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
STRIP	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
NOTSTRIP	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
return	TokenNamereturn
NOTSTRIP	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
