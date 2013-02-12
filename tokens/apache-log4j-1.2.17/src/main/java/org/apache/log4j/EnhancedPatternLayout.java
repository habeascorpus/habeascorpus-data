package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
OptionConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
PatternConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
pattern	TokenNameIdentifier
.	TokenNameDOT
BridgePatternConverter	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
spi	TokenNameIdentifier
.	TokenNameDOT
LoggingEvent	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
EnhancedPatternLayout	TokenNameIdentifier
extends	TokenNameextends
Layout	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
DEFAULT_CONVERSION_PATTERN	TokenNameIdentifier
=	TokenNameEQUAL
"%m%n"	TokenNameStringLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
TTCC_CONVERSION_PATTERN	TokenNameIdentifier
=	TokenNameEQUAL
"%r [%t] %p %c %x - %m%n"	TokenNameStringLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
int	TokenNameint
BUF_SIZE	TokenNameIdentifier
=	TokenNameEQUAL
256	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
final	TokenNamefinal
int	TokenNameint
MAX_CAPACITY	TokenNameIdentifier
=	TokenNameEQUAL
1024	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
String	TokenNameIdentifier
PATTERN_RULE_REGISTRY	TokenNameIdentifier
=	TokenNameEQUAL
"PATTERN_RULE_REGISTRY"	TokenNameStringLiteral
;	TokenNameSEMICOLON
private	TokenNameprivate
PatternConverter	TokenNameIdentifier
head	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
String	TokenNameIdentifier
conversionPattern	TokenNameIdentifier
;	TokenNameSEMICOLON
private	TokenNameprivate
boolean	TokenNameboolean
handlesExceptions	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
EnhancedPatternLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
(	TokenNameLPAREN
DEFAULT_CONVERSION_PATTERN	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
EnhancedPatternLayout	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
conversionPattern	TokenNameIdentifier
=	TokenNameEQUAL
pattern	TokenNameIdentifier
;	TokenNameSEMICOLON
head	TokenNameIdentifier
=	TokenNameEQUAL
createPatternParser	TokenNameIdentifier
(	TokenNameLPAREN
(	TokenNameLPAREN
pattern	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
?	TokenNameQUESTION
DEFAULT_CONVERSION_PATTERN	TokenNameIdentifier
:	TokenNameCOLON
pattern	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
head	TokenNameIdentifier
instanceof	TokenNameinstanceof
BridgePatternConverter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
handlesExceptions	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
(	TokenNameLPAREN
(	TokenNameLPAREN
BridgePatternConverter	TokenNameIdentifier
)	TokenNameRPAREN
head	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
ignoresThrowable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
handlesExceptions	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setConversionPattern	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
String	TokenNameIdentifier
conversionPattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
conversionPattern	TokenNameIdentifier
=	TokenNameEQUAL
OptionConverter	TokenNameIdentifier
.	TokenNameDOT
convertSpecialChars	TokenNameIdentifier
(	TokenNameLPAREN
conversionPattern	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
head	TokenNameIdentifier
=	TokenNameEQUAL
createPatternParser	TokenNameIdentifier
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
conversionPattern	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
parse	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
head	TokenNameIdentifier
instanceof	TokenNameinstanceof
BridgePatternConverter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
handlesExceptions	TokenNameIdentifier
=	TokenNameEQUAL
!	TokenNameNOT
(	TokenNameLPAREN
(	TokenNameLPAREN
BridgePatternConverter	TokenNameIdentifier
)	TokenNameRPAREN
head	TokenNameIdentifier
)	TokenNameRPAREN
.	TokenNameDOT
ignoresThrowable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
handlesExceptions	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
getConversionPattern	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
conversionPattern	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
PatternParser	TokenNameIdentifier
createPatternParser	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
pattern	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
new	TokenNamenew
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
pattern	TokenNameIdentifier
.	TokenNameDOT
BridgePatternParser	TokenNameIdentifier
(	TokenNameLPAREN
pattern	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
activateOptions	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
public	TokenNamepublic
String	TokenNameIdentifier
format	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
StringBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
StringBuffer	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
for	TokenNamefor
(	TokenNameLPAREN
PatternConverter	TokenNameIdentifier
c	TokenNameIdentifier
=	TokenNameEQUAL
head	TokenNameIdentifier
;	TokenNameSEMICOLON
c	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
c	TokenNameIdentifier
=	TokenNameEQUAL
c	TokenNameIdentifier
.	TokenNameDOT
next	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
c	TokenNameIdentifier
.	TokenNameDOT
format	TokenNameIdentifier
(	TokenNameLPAREN
buf	TokenNameIdentifier
,	TokenNameCOMMA
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
buf	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
ignoresThrowable	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
!	TokenNameNOT
handlesExceptions	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
