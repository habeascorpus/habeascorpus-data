package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
cassandra	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
File	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
IOError	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
FSError	TokenNameIdentifier
extends	TokenNameextends
IOError	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
File	TokenNameIdentifier
path	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
FSError	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
cause	TokenNameIdentifier
,	TokenNameCOMMA
File	TokenNameIdentifier
path	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
cause	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
this	TokenNamethis
.	TokenNameDOT
path	TokenNameIdentifier
=	TokenNameEQUAL
path	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
FSError	TokenNameIdentifier
findNested	TokenNameIdentifier
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
top	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
for	TokenNamefor
(	TokenNameLPAREN
Throwable	TokenNameIdentifier
t	TokenNameIdentifier
=	TokenNameEQUAL
top	TokenNameIdentifier
;	TokenNameSEMICOLON
t	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
t	TokenNameIdentifier
=	TokenNameEQUAL
t	TokenNameIdentifier
.	TokenNameDOT
getCause	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
t	TokenNameIdentifier
instanceof	TokenNameinstanceof
FSError	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
(	TokenNameLPAREN
FSError	TokenNameIdentifier
)	TokenNameRPAREN
t	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE