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
html	TokenNameIdentifier
.	TokenNameDOT
HTMLOListElement	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
HTMLOListElementImpl	TokenNameIdentifier
extends	TokenNameextends
HTMLElementImpl	TokenNameIdentifier
implements	TokenNameimplements
HTMLOListElement	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
1293750546025862146L	TokenNameLongLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
boolean	TokenNameboolean
getCompact	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getBinary	TokenNameIdentifier
(	TokenNameLPAREN
"compact"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setCompact	TokenNameIdentifier
(	TokenNameLPAREN
boolean	TokenNameboolean
compact	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"compact"	TokenNameStringLiteral
,	TokenNameCOMMA
compact	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
int	TokenNameint
getStart	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getInteger	TokenNameIdentifier
(	TokenNameLPAREN
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"start"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setStart	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
start	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"start"	TokenNameStringLiteral
,	TokenNameCOMMA
String	TokenNameIdentifier
.	TokenNameDOT
valueOf	TokenNameIdentifier
(	TokenNameLPAREN
start	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getType	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
getAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"type"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setType	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
type	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
setAttribute	TokenNameIdentifier
(	TokenNameLPAREN
"type"	TokenNameStringLiteral
,	TokenNameCOMMA
type	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
HTMLOListElementImpl	TokenNameIdentifier
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
}	TokenNameRBRACE
