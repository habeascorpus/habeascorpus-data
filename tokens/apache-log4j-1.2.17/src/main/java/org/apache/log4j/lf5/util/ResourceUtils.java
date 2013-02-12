package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
lf5	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
InputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
net	TokenNameIdentifier
.	TokenNameDOT
URL	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
ResourceUtils	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
InputStream	TokenNameIdentifier
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
object	TokenNameIdentifier
,	TokenNameCOMMA
Resource	TokenNameIdentifier
resource	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
loader	TokenNameIdentifier
=	TokenNameEQUAL
object	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
InputStream	TokenNameIdentifier
in	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
loader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
in	TokenNameIdentifier
=	TokenNameEQUAL
loader	TokenNameIdentifier
.	TokenNameDOT
getResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
resource	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
in	TokenNameIdentifier
=	TokenNameEQUAL
ClassLoader	TokenNameIdentifier
.	TokenNameDOT
getSystemResourceAsStream	TokenNameIdentifier
(	TokenNameLPAREN
resource	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
in	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
URL	TokenNameIdentifier
getResourceAsURL	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
object	TokenNameIdentifier
,	TokenNameCOMMA
Resource	TokenNameIdentifier
resource	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
ClassLoader	TokenNameIdentifier
loader	TokenNameIdentifier
=	TokenNameEQUAL
object	TokenNameIdentifier
.	TokenNameDOT
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
.	TokenNameDOT
getClassLoader	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
URL	TokenNameIdentifier
url	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
loader	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
url	TokenNameIdentifier
=	TokenNameEQUAL
loader	TokenNameIdentifier
.	TokenNameDOT
getResource	TokenNameIdentifier
(	TokenNameLPAREN
resource	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
url	TokenNameIdentifier
=	TokenNameEQUAL
ClassLoader	TokenNameIdentifier
.	TokenNameDOT
getSystemResource	TokenNameIdentifier
(	TokenNameLPAREN
resource	TokenNameIdentifier
.	TokenNameDOT
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
(	TokenNameLPAREN
url	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE