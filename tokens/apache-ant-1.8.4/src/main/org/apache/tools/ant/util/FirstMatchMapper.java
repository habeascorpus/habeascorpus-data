package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
tools	TokenNameIdentifier
.	TokenNameDOT
ant	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
Iterator	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
FirstMatchMapper	TokenNameIdentifier
extends	TokenNameextends
ContainerMapper	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
sourceFileName	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Iterator	TokenNameIdentifier
iter	TokenNameIdentifier
=	TokenNameEQUAL
getMappers	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
iterator	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
iter	TokenNameIdentifier
.	TokenNameDOT
hasNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
)	TokenNameRPAREN
{	TokenNameLBRACE
FileNameMapper	TokenNameIdentifier
mapper	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
FileNameMapper	TokenNameIdentifier
)	TokenNameRPAREN
iter	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
mapper	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
String	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
mapped	TokenNameIdentifier
=	TokenNameEQUAL
mapper	TokenNameIdentifier
.	TokenNameDOT
mapFileName	TokenNameIdentifier
(	TokenNameLPAREN
sourceFileName	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
mapped	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
mapped	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
