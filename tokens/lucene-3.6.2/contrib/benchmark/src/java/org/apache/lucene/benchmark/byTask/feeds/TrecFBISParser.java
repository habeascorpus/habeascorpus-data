package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
benchmark	TokenNameIdentifier
.	TokenNameDOT
byTask	TokenNameIdentifier
.	TokenNameDOT
feeds	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Date	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
TrecFBISParser	TokenNameIdentifier
extends	TokenNameextends
TrecDocParser	TokenNameIdentifier
{	TokenNameLBRACE
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
HEADER	TokenNameIdentifier
=	TokenNameEQUAL
"<HEADER>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
HEADER_END	TokenNameIdentifier
=	TokenNameEQUAL
"</HEADER>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
HEADER_END_LENGTH	TokenNameIdentifier
=	TokenNameEQUAL
HEADER_END	TokenNameIdentifier
.	TokenNameDOT
length	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DATE1	TokenNameIdentifier
=	TokenNameEQUAL
"<DATE1>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DATE1_END	TokenNameIdentifier
=	TokenNameEQUAL
"</DATE1>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
TI	TokenNameIdentifier
=	TokenNameEQUAL
"<TI>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
TI_END	TokenNameIdentifier
=	TokenNameEQUAL
"</TI>"	TokenNameStringLiteral
;	TokenNameSEMICOLON
@	TokenNameAT
Override	TokenNameIdentifier
public	TokenNamepublic
DocData	TokenNameIdentifier
parse	TokenNameIdentifier
(	TokenNameLPAREN
DocData	TokenNameIdentifier
docData	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
name	TokenNameIdentifier
,	TokenNameCOMMA
TrecContentSource	TokenNameIdentifier
trecSrc	TokenNameIdentifier
,	TokenNameCOMMA
StringBuilder	TokenNameIdentifier
docBuf	TokenNameIdentifier
,	TokenNameCOMMA
ParsePathType	TokenNameIdentifier
pathType	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
InterruptedException	TokenNameIdentifier
{	TokenNameLBRACE
int	TokenNameint
mark	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Date	TokenNameIdentifier
date	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
String	TokenNameIdentifier
title	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
int	TokenNameint
h1	TokenNameIdentifier
=	TokenNameEQUAL
docBuf	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
HEADER	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
h1	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
h2	TokenNameIdentifier
=	TokenNameEQUAL
docBuf	TokenNameIdentifier
.	TokenNameDOT
indexOf	TokenNameIdentifier
(	TokenNameLPAREN
HEADER_END	TokenNameIdentifier
,	TokenNameCOMMA
h1	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
mark	TokenNameIdentifier
=	TokenNameEQUAL
h2	TokenNameIdentifier
+	TokenNamePLUS
HEADER_END_LENGTH	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
dateStr	TokenNameIdentifier
=	TokenNameEQUAL
extract	TokenNameIdentifier
(	TokenNameLPAREN
docBuf	TokenNameIdentifier
,	TokenNameCOMMA
DATE1	TokenNameIdentifier
,	TokenNameCOMMA
DATE1_END	TokenNameIdentifier
,	TokenNameCOMMA
h2	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
dateStr	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
date	TokenNameIdentifier
=	TokenNameEQUAL
trecSrc	TokenNameIdentifier
.	TokenNameDOT
parseDate	TokenNameIdentifier
(	TokenNameLPAREN
dateStr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
title	TokenNameIdentifier
=	TokenNameEQUAL
extract	TokenNameIdentifier
(	TokenNameLPAREN
docBuf	TokenNameIdentifier
,	TokenNameCOMMA
TI	TokenNameIdentifier
,	TokenNameCOMMA
TI_END	TokenNameIdentifier
,	TokenNameCOMMA
h2	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
docData	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docData	TokenNameIdentifier
.	TokenNameDOT
setName	TokenNameIdentifier
(	TokenNameLPAREN
name	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docData	TokenNameIdentifier
.	TokenNameDOT
setDate	TokenNameIdentifier
(	TokenNameLPAREN
date	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docData	TokenNameIdentifier
.	TokenNameDOT
setTitle	TokenNameIdentifier
(	TokenNameLPAREN
title	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
docData	TokenNameIdentifier
.	TokenNameDOT
setBody	TokenNameIdentifier
(	TokenNameLPAREN
stripTags	TokenNameIdentifier
(	TokenNameLPAREN
docBuf	TokenNameIdentifier
,	TokenNameCOMMA
mark	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
docData	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
