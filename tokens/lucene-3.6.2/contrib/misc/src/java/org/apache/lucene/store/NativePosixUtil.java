package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
lucene	TokenNameIdentifier
.	TokenNameDOT
store	TokenNameIdentifier
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
FileDescriptor	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
nio	TokenNameIdentifier
.	TokenNameDOT
ByteBuffer	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
class	TokenNameclass
NativePosixUtil	TokenNameIdentifier
{	TokenNameLBRACE
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
NORMAL	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
SEQUENTIAL	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
RANDOM	TokenNameIdentifier
=	TokenNameEQUAL
2	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
WILLNEED	TokenNameIdentifier
=	TokenNameEQUAL
3	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
DONTNEED	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
public	TokenNamepublic
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
NOREUSE	TokenNameIdentifier
=	TokenNameEQUAL
5	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
{	TokenNameLBRACE
System	TokenNameIdentifier
.	TokenNameDOT
loadLibrary	TokenNameIdentifier
(	TokenNameLPAREN
"NativePosixUtil"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
private	TokenNameprivate
static	TokenNamestatic
native	TokenNamenative
int	TokenNameint
posix_fadvise	TokenNameIdentifier
(	TokenNameLPAREN
FileDescriptor	TokenNameIdentifier
fd	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
offset	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
len	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
advise	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
native	TokenNamenative
int	TokenNameint
posix_madvise	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
advise	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
native	TokenNamenative
int	TokenNameint
madvise	TokenNameIdentifier
(	TokenNameLPAREN
ByteBuffer	TokenNameIdentifier
buf	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
advise	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
native	TokenNamenative
FileDescriptor	TokenNameIdentifier
open_direct	TokenNameIdentifier
(	TokenNameLPAREN
String	TokenNameIdentifier
filename	TokenNameIdentifier
,	TokenNameCOMMA
boolean	TokenNameboolean
read	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
native	TokenNamenative
long	TokenNamelong
pread	TokenNameIdentifier
(	TokenNameLPAREN
FileDescriptor	TokenNameIdentifier
fd	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
pos	TokenNameIdentifier
,	TokenNameCOMMA
ByteBuffer	TokenNameIdentifier
byteBuf	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
static	TokenNamestatic
void	TokenNamevoid
advise	TokenNameIdentifier
(	TokenNameLPAREN
FileDescriptor	TokenNameIdentifier
fd	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
offset	TokenNameIdentifier
,	TokenNameCOMMA
long	TokenNamelong
len	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
advise	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
IOException	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
code	TokenNameIdentifier
=	TokenNameEQUAL
posix_fadvise	TokenNameIdentifier
(	TokenNameLPAREN
fd	TokenNameIdentifier
,	TokenNameCOMMA
offset	TokenNameIdentifier
,	TokenNameCOMMA
len	TokenNameIdentifier
,	TokenNameCOMMA
advise	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
code	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
throw	TokenNamethrow
new	TokenNamenew
RuntimeException	TokenNameIdentifier
(	TokenNameLPAREN
"posix_fadvise failed code="	TokenNameStringLiteral
+	TokenNamePLUS
code	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
