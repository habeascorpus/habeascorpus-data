package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
html	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
html	TokenNameIdentifier
.	TokenNameDOT
HTMLCollection	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
html	TokenNameIdentifier
.	TokenNameDOT
HTMLElement	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
html	TokenNameIdentifier
.	TokenNameDOT
HTMLTableRowElement	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
w3c	TokenNameIdentifier
.	TokenNameDOT
dom	TokenNameIdentifier
.	TokenNameDOT
html	TokenNameIdentifier
.	TokenNameDOT
HTMLTableSectionElement	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
HTMLTableSectionElementImpl	TokenNameIdentifier
extends	TokenNameextends
HTMLElementImpl	TokenNameIdentifier
implements	TokenNameimplements
HTMLTableSectionElement	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
1016412997716618027L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
String	TokenNameIdentifier
getAlign	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
capitalize	TokenNameIdentifier
(	TokenNameLPAREN
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"align"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setAlign	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
align	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"align"	TokenNameStringLiteral
,	TokenNameCOMMA
align	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getCh	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
ch	TokenNameIdentifier
;	TokenNameSEMICOLON
ch	TokenNameIdentifier
=	TokenNameEQUAL
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"char"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ch	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
ch	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
ch	TokenNameIdentifier
=	TokenNameEQUAL
ch	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
ch	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setCh	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
ch	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
ch	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
&&	TokenNameAND_AND
ch	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
>	TokenNameGREATER
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
ch	TokenNameIdentifier
=	TokenNameEQUAL
ch	TokenNameIdentifier
.	TokenNameDOT
substring	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"char"	TokenNameStringLiteral
,	TokenNameCOMMA
ch	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getChOff	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"charoff"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setChOff	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
chOff	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"charoff"	TokenNameStringLiteral
,	TokenNameCOMMA
chOff	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getVAlign	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
capitalize	TokenNameIdentifier
(	TokenNameLPAREN
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"valign"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setVAlign	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
vAlign	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"valign"	TokenNameStringLiteral
,	TokenNameCOMMA
vAlign	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
HTMLCollection	TokenNameIdentifier
getRows	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
_rows	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
_rows	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HTMLCollectionImpl	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
,	TokenNameCOMMA
HTMLCollectionImpl	TokenNameIdentifier
.	TokenNameDOT
ROW	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
_rows	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
HTMLElement	TokenNameIdentifier
insertRow	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
HTMLTableRowElementImpl	TokenNameIdentifier
newRow	TokenNameIdentifier
;	TokenNameSEMICOLON
newRow	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
HTMLTableRowElementImpl	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
HTMLDocumentImpl	TokenNameIdentifier
)	TokenNameRPAREN
getOwnerDocument	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
,	TokenNameCOMMA
"TR"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
newRow	TokenNameIdentifier
.	TokenNameDOT
insertCell	TokenNameIdentifier
(	TokenNameLPAREN
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
insertRowX	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
,	TokenNameCOMMA
newRow	TokenNameIdentifier
)	TokenNameRPAREN
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
appendChild	TokenNameIdentifier
(	TokenNameLPAREN
newRow	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
newRow	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
insertRowX	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
,	TokenNameCOMMA
HTMLTableRowElementImpl	TokenNameIdentifier
newRow	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
child	TokenNameIdentifier
;	TokenNameSEMICOLON
child	TokenNameIdentifier
=	TokenNameEQUAL
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
child	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
child	TokenNameIdentifier
instanceof	TokenNameinstanceof
HTMLTableRowElement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
insertBefore	TokenNameIdentifier
(	TokenNameLPAREN
newRow	TokenNameIdentifier
,	TokenNameCOMMA
child	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
--	TokenNameMINUS_MINUS
index	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
child	TokenNameIdentifier
=	TokenNameEQUAL
child	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
index	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
deleteRow	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
deleteRowX	TokenNameIdentifier
(	TokenNameLPAREN
index	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
deleteRowX	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
index	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
Node	TokenNameIdentifier
child	TokenNameIdentifier
;	TokenNameSEMICOLON
child	TokenNameIdentifier
=	TokenNameEQUAL
getFirstChild	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
child	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
child	TokenNameIdentifier
instanceof	TokenNameinstanceof
HTMLTableRowElement	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
index	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
removeChild	TokenNameIdentifier
(	TokenNameLPAREN
child	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
--	TokenNameMINUS_MINUS
index	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
child	TokenNameIdentifier
=	TokenNameEQUAL
child	TokenNameIdentifier
.	TokenNameDOT
getNextSibling	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
index	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Node	TokenNameIdentifier
cloneNode	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
deep	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
HTMLTableSectionElementImpl	TokenNameIdentifier
clonedNode	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
HTMLTableSectionElementImpl	TokenNameIdentifier
)	TokenNameRPAREN
super	TokenNamesuper
.	TokenNameDOT
cloneNode	TokenNameIdentifier
(	TokenNameLPAREN
deep	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
clonedNode	TokenNameIdentifier
.	TokenNameDOT
_rows	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
return	TokenNamereturn
clonedNode	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
HTMLTableSectionElementImpl	TokenNameIdentifier
(	TokenNameLPAREN
HTMLDocumentImpl	TokenNameIdentifier
owner	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
owner	TokenNameIdentifier
,	TokenNameCOMMA
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
HTMLCollectionImpl	TokenNameIdentifier
_rows	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE