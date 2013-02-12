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
spi	TokenNameIdentifier
.	TokenNameDOT
Filter	TokenNameIdentifier
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
ErrorHandler	TokenNameIdentifier
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
OptionHandler	TokenNameIdentifier
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
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
.	TokenNameDOT
helpers	TokenNameIdentifier
.	TokenNameDOT
OnlyOnceErrorHandler	TokenNameIdentifier
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
LogLog	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
abstract	TokenNameabstract
class	TokenNameclass
AppenderSkeleton	TokenNameIdentifier
implements	TokenNameimplements
Appender	TokenNameIdentifier
,	TokenNameCOMMA
OptionHandler	TokenNameIdentifier
{	TokenNameLBRACE
protected	TokenNameprotected
Layout	TokenNameIdentifier
layout	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
String	TokenNameIdentifier
name	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Priority	TokenNameIdentifier
threshold	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
ErrorHandler	TokenNameIdentifier
errorHandler	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
OnlyOnceErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
protected	TokenNameprotected
Filter	TokenNameIdentifier
headFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
Filter	TokenNameIdentifier
tailFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
protected	TokenNameprotected
boolean	TokenNameboolean
closed	TokenNameIdentifier
=	TokenNameEQUAL
false	TokenNamefalse
;	TokenNameSEMICOLON
public	TokenNamepublic
AppenderSkeleton	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
protected	TokenNameprotected
AppenderSkeleton	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
boolean	TokenNameboolean
isActive	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
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
void	TokenNamevoid
addFilter	TokenNameIdentifier
(	TokenNameLPAREN
Filter	TokenNameIdentifier
newFilter	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
headFilter	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
headFilter	TokenNameIdentifier
=	TokenNameEQUAL
tailFilter	TokenNameIdentifier
=	TokenNameEQUAL
newFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
tailFilter	TokenNameIdentifier
.	TokenNameDOT
setNext	TokenNameIdentifier
(	TokenNameLPAREN
newFilter	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
tailFilter	TokenNameIdentifier
=	TokenNameEQUAL
newFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
abstract	TokenNameabstract
protected	TokenNameprotected
void	TokenNamevoid
append	TokenNameIdentifier
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
void	TokenNamevoid
clearFilters	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
headFilter	TokenNameIdentifier
=	TokenNameEQUAL
tailFilter	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
finalize	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
closed	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
;	TokenNameSEMICOLON
LogLog	TokenNameIdentifier
.	TokenNameDOT
debug	TokenNameIdentifier
(	TokenNameLPAREN
"Finalizing appender named ["	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
+	TokenNamePLUS
"]."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
close	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
ErrorHandler	TokenNameIdentifier
getErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
errorHandler	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Filter	TokenNameIdentifier
getFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
headFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
Filter	TokenNameIdentifier
getFirstFilter	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
headFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Layout	TokenNameIdentifier
getLayout	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
layout	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
final	TokenNamefinal
String	TokenNameIdentifier
getName	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
this	TokenNamethis
.	TokenNameDOT
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
Priority	TokenNameIdentifier
getThreshold	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
threshold	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
boolean	TokenNameboolean
isAsSevereAsThreshold	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
priority	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
(	TokenNameLPAREN
threshold	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
||	TokenNameOR_OR
priority	TokenNameIdentifier
.	TokenNameDOT
isGreaterOrEqual	TokenNameIdentifier
(	TokenNameLPAREN
threshold	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
doAppend	TokenNameIdentifier
(	TokenNameLPAREN
LoggingEvent	TokenNameIdentifier
event	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
closed	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
error	TokenNameIdentifier
(	TokenNameLPAREN
"Attempted to append to closed appender named ["	TokenNameStringLiteral
+	TokenNamePLUS
name	TokenNameIdentifier
+	TokenNamePLUS
"]."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
isAsSevereAsThreshold	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
.	TokenNameDOT
getLevel	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
;	TokenNameSEMICOLON
}	TokenNameRBRACE
Filter	TokenNameIdentifier
f	TokenNameIdentifier
=	TokenNameEQUAL
this	TokenNamethis
.	TokenNameDOT
headFilter	TokenNameIdentifier
;	TokenNameSEMICOLON
FILTER_LOOP	TokenNameIdentifier
:	TokenNameCOLON
while	TokenNamewhile
(	TokenNameLPAREN
f	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
f	TokenNameIdentifier
.	TokenNameDOT
decide	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
Filter	TokenNameIdentifier
.	TokenNameDOT
DENY	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
;	TokenNameSEMICOLON
case	TokenNamecase
Filter	TokenNameIdentifier
.	TokenNameDOT
ACCEPT	TokenNameIdentifier
:	TokenNameCOLON
break	TokenNamebreak
FILTER_LOOP	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
Filter	TokenNameIdentifier
.	TokenNameDOT
NEUTRAL	TokenNameIdentifier
:	TokenNameCOLON
f	TokenNameIdentifier
=	TokenNameEQUAL
f	TokenNameIdentifier
.	TokenNameDOT
getNext	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
this	TokenNamethis
.	TokenNameDOT
append	TokenNameIdentifier
(	TokenNameLPAREN
event	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
setErrorHandler	TokenNameIdentifier
(	TokenNameLPAREN
ErrorHandler	TokenNameIdentifier
eh	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
eh	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
LogLog	TokenNameIdentifier
.	TokenNameDOT
warn	TokenNameIdentifier
(	TokenNameLPAREN
"You have tried to set a null error-handler."	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
errorHandler	TokenNameIdentifier
=	TokenNameEQUAL
eh	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setLayout	TokenNameIdentifier
(	TokenNameLPAREN
Layout	TokenNameIdentifier
layout	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
layout	TokenNameIdentifier
=	TokenNameEQUAL
layout	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setName	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
name	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
name	TokenNameIdentifier
=	TokenNameEQUAL
name	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
void	TokenNamevoid
setThreshold	TokenNameIdentifier
(	TokenNameLPAREN
Priority	TokenNameIdentifier
threshold	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
this	TokenNamethis
.	TokenNameDOT
threshold	TokenNameIdentifier
=	TokenNameEQUAL
threshold	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE