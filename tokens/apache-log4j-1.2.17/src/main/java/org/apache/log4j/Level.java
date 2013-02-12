package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
log4j	TokenNameIdentifier
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
io	TokenNameIdentifier
.	TokenNameDOT
ObjectInputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ObjectOutputStream	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
ObjectStreamException	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
io	TokenNameIdentifier
.	TokenNameDOT
Serializable	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
Level	TokenNameIdentifier
extends	TokenNameextends
Priority	TokenNameIdentifier
implements	TokenNameimplements
Serializable	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
TRACE_INT	TokenNameIdentifier
=	TokenNameEQUAL
5000	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
public	TokenNamepublic
Level	TokenNameIdentifier
OFF	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Level	TokenNameIdentifier
(	TokenNameLPAREN
OFF_INT	TokenNameIdentifier
,	TokenNameCOMMA
"OFF"	TokenNameStringLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
public	TokenNamepublic
Level	TokenNameIdentifier
FATAL	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Level	TokenNameIdentifier
(	TokenNameLPAREN
FATAL_INT	TokenNameIdentifier
,	TokenNameCOMMA
"FATAL"	TokenNameStringLiteral
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
public	TokenNamepublic
Level	TokenNameIdentifier
ERROR	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Level	TokenNameIdentifier
(	TokenNameLPAREN
ERROR_INT	TokenNameIdentifier
,	TokenNameCOMMA
"ERROR"	TokenNameStringLiteral
,	TokenNameCOMMA
3	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
public	TokenNamepublic
Level	TokenNameIdentifier
WARN	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Level	TokenNameIdentifier
(	TokenNameLPAREN
WARN_INT	TokenNameIdentifier
,	TokenNameCOMMA
"WARN"	TokenNameStringLiteral
,	TokenNameCOMMA
4	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
public	TokenNamepublic
Level	TokenNameIdentifier
INFO	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Level	TokenNameIdentifier
(	TokenNameLPAREN
INFO_INT	TokenNameIdentifier
,	TokenNameCOMMA
"INFO"	TokenNameStringLiteral
,	TokenNameCOMMA
6	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
public	TokenNamepublic
Level	TokenNameIdentifier
DEBUG	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Level	TokenNameIdentifier
(	TokenNameLPAREN
DEBUG_INT	TokenNameIdentifier
,	TokenNameCOMMA
"DEBUG"	TokenNameStringLiteral
,	TokenNameCOMMA
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
final	TokenNamefinal
Level	TokenNameIdentifier
TRACE	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Level	TokenNameIdentifier
(	TokenNameLPAREN
TRACE_INT	TokenNameIdentifier
,	TokenNameCOMMA
"TRACE"	TokenNameStringLiteral
,	TokenNameCOMMA
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
public	TokenNamepublic
Level	TokenNameIdentifier
ALL	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
Level	TokenNameIdentifier
(	TokenNameLPAREN
ALL_INT	TokenNameIdentifier
,	TokenNameCOMMA
"ALL"	TokenNameStringLiteral
,	TokenNameCOMMA
7	TokenNameIntegerLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
long	TokenNamelong
serialVersionUID	TokenNameIdentifier
=	TokenNameEQUAL
3491141966387921974L	TokenNameLongLiteral
;	TokenNameSEMICOLON
protected	TokenNameprotected
Level	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
level	TokenNameIdentifier
,	TokenNameCOMMA
String	TokenNameIdentifier
levelStr	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
syslogEquivalent	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
super	TokenNamesuper
(	TokenNameLPAREN
level	TokenNameIdentifier
,	TokenNameCOMMA
levelStr	TokenNameIdentifier
,	TokenNameCOMMA
syslogEquivalent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Level	TokenNameIdentifier
toLevel	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
sArg	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Level	TokenNameIdentifier
)	TokenNameRPAREN
toLevel	TokenNameIdentifier
(	TokenNameLPAREN
sArg	TokenNameIdentifier
,	TokenNameCOMMA
Level	TokenNameIdentifier
.	TokenNameDOT
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Level	TokenNameIdentifier
toLevel	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
(	TokenNameLPAREN
Level	TokenNameIdentifier
)	TokenNameRPAREN
toLevel	TokenNameIdentifier
(	TokenNameLPAREN
val	TokenNameIdentifier
,	TokenNameCOMMA
Level	TokenNameIdentifier
.	TokenNameDOT
DEBUG	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Level	TokenNameIdentifier
toLevel	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
val	TokenNameIdentifier
,	TokenNameCOMMA
Level	TokenNameIdentifier
defaultLevel	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
switch	TokenNameswitch
(	TokenNameLPAREN
val	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
case	TokenNamecase
ALL_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
ALL	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
DEBUG_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
DEBUG	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
INFO_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
INFO	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
WARN_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
WARN	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
ERROR_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
ERROR	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
FATAL_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
FATAL	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
OFF_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
OFF	TokenNameIdentifier
;	TokenNameSEMICOLON
case	TokenNamecase
TRACE_INT	TokenNameIdentifier
:	TokenNameCOLON
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
TRACE	TokenNameIdentifier
;	TokenNameSEMICOLON
default	TokenNamedefault
:	TokenNameCOLON
return	TokenNamereturn
defaultLevel	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
public	TokenNamepublic
static	TokenNamestatic
Level	TokenNameIdentifier
toLevel	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
sArg	TokenNameIdentifier
,	TokenNameCOMMA
Level	TokenNameIdentifier
defaultLevel	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
sArg	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
return	TokenNamereturn
defaultLevel	TokenNameIdentifier
;	TokenNameSEMICOLON
String	TokenNameIdentifier
s	TokenNameIdentifier
=	TokenNameEQUAL
sArg	TokenNameIdentifier
.	TokenNameDOT
toUpperCase	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"ALL"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
ALL	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"DEBUG"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
DEBUG	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"INFO"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
INFO	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"WARN"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
WARN	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"ERROR"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
ERROR	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"FATAL"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
FATAL	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"OFF"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
OFF	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"TRACE"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
TRACE	TokenNameIdentifier
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
s	TokenNameIdentifier
.	TokenNameDOT
equals	TokenNameIdentifier
(	TokenNameLPAREN
"İNFO"	TokenNameStringLiteral
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
Level	TokenNameIdentifier
.	TokenNameDOT
INFO	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
defaultLevel	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
readObject	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
ObjectInputStream	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
,	TokenNameCOMMA
ClassNotFoundException	TokenNameIdentifier
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
defaultReadObject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
level	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
syslogEquivalent	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
readInt	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
levelStr	TokenNameIdentifier
=	TokenNameEQUAL
s	TokenNameIdentifier
.	TokenNameDOT
readUTF	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
levelStr	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
null	TokenNamenull
)	TokenNameRPAREN
{	TokenNameLBRACE
levelStr	TokenNameIdentifier
=	TokenNameEQUAL
""	TokenNameStringLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
private	TokenNameprivate
void	TokenNamevoid
writeObject	TokenNameIdentifier
(	TokenNameLPAREN
final	TokenNamefinal
ObjectOutputStream	TokenNameIdentifier
s	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
s	TokenNameIdentifier
.	TokenNameDOT
defaultWriteObject	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
level	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
writeInt	TokenNameIdentifier
(	TokenNameLPAREN
syslogEquivalent	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
s	TokenNameIdentifier
.	TokenNameDOT
writeUTF	TokenNameIdentifier
(	TokenNameLPAREN
levelStr	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
Object	TokenNameIdentifier
readResolve	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
throws	TokenNamethrows
ObjectStreamException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
getClass	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
==	TokenNameEQUAL_EQUAL
Level	TokenNameIdentifier
.	TokenNameDOT
class	TokenNameclass
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
toLevel	TokenNameIdentifier
(	TokenNameLPAREN
level	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
this	TokenNamethis
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
