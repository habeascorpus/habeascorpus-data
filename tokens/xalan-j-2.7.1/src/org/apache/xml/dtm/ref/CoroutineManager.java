package	TokenNamepackage
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
dtm	TokenNameIdentifier
.	TokenNameDOT
ref	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
java	TokenNameIdentifier
.	TokenNameDOT
util	TokenNameIdentifier
.	TokenNameDOT
BitSet	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
res	TokenNameIdentifier
.	TokenNameDOT
XMLErrorResources	TokenNameIdentifier
;	TokenNameSEMICOLON
import	TokenNameimport
org	TokenNameIdentifier
.	TokenNameDOT
apache	TokenNameIdentifier
.	TokenNameDOT
xml	TokenNameIdentifier
.	TokenNameDOT
res	TokenNameIdentifier
.	TokenNameDOT
XMLMessages	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
class	TokenNameclass
CoroutineManager	TokenNameIdentifier
{	TokenNameLBRACE
BitSet	TokenNameIdentifier
m_activeIDs	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
BitSet	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
m_unreasonableId	TokenNameIdentifier
=	TokenNameEQUAL
1024	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
Object	TokenNameIdentifier
m_yield	TokenNameIdentifier
=	TokenNameEQUAL
null	TokenNamenull
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
NOBODY	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
final	TokenNamefinal
static	TokenNamestatic
int	TokenNameint
ANYBODY	TokenNameIdentifier
=	TokenNameEQUAL
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
m_nextCoroutine	TokenNameIdentifier
=	TokenNameEQUAL
NOBODY	TokenNameIdentifier
;	TokenNameSEMICOLON
public	TokenNamepublic
synchronized	TokenNamesynchronized
int	TokenNameint
co_joinCoroutineSet	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
coroutineID	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
coroutineID	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
coroutineID	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_unreasonableId	TokenNameIdentifier
||	TokenNameOR_OR
m_activeIDs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
coroutineID	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
else	TokenNameelse
{	TokenNameLBRACE
coroutineID	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
coroutineID	TokenNameIdentifier
<	TokenNameLESS
m_unreasonableId	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
m_activeIDs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
coroutineID	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
++	TokenNamePLUS_PLUS
coroutineID	TokenNameIdentifier
;	TokenNameSEMICOLON
else	TokenNameelse
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
coroutineID	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_unreasonableId	TokenNameIdentifier
)	TokenNameRPAREN
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
m_activeIDs	TokenNameIdentifier
.	TokenNameDOT
set	TokenNameIdentifier
(	TokenNameLPAREN
coroutineID	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
coroutineID	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
Object	TokenNameIdentifier
co_entry_pause	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
thisCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
NoSuchMethodException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
m_activeIDs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
thisCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
NoSuchMethodException	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
m_nextCoroutine	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
thisCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
wait	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
InterruptedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
return	TokenNamereturn
m_yield	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
Object	TokenNameIdentifier
co_resume	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
arg_object	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
thisCoroutine	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
toCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
NoSuchMethodException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
m_activeIDs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
toCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
NoSuchMethodException	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessages	TokenNameIdentifier
.	TokenNameDOT
createXMLMessage	TokenNameIdentifier
(	TokenNameLPAREN
XMLErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_COROUTINE_NOT_AVAIL	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
toCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_yield	TokenNameIdentifier
=	TokenNameEQUAL
arg_object	TokenNameIdentifier
;	TokenNameSEMICOLON
m_nextCoroutine	TokenNameIdentifier
=	TokenNameEQUAL
toCoroutine	TokenNameIdentifier
;	TokenNameSEMICOLON
notify	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
m_nextCoroutine	TokenNameIdentifier
!=	TokenNameNOT_EQUAL
thisCoroutine	TokenNameIdentifier
||	TokenNameOR_OR
m_nextCoroutine	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
ANYBODY	TokenNameIdentifier
||	TokenNameOR_OR
m_nextCoroutine	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NOBODY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
try	TokenNametry
{	TokenNameLBRACE
wait	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
catch	TokenNamecatch
(	TokenNameLPAREN
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
InterruptedException	TokenNameIdentifier
e	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
m_nextCoroutine	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
NOBODY	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
co_exit	TokenNameIdentifier
(	TokenNameLPAREN
thisCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
throw	TokenNamethrow
new	TokenNamenew
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
NoSuchMethodException	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessages	TokenNameIdentifier
.	TokenNameDOT
createXMLMessage	TokenNameIdentifier
(	TokenNameLPAREN
XMLErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_COROUTINE_CO_EXIT	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
m_yield	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
co_exit	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
thisCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
m_activeIDs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
thisCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_nextCoroutine	TokenNameIdentifier
=	TokenNameEQUAL
NOBODY	TokenNameIdentifier
;	TokenNameSEMICOLON
notify	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
public	TokenNamepublic
synchronized	TokenNamesynchronized
void	TokenNamevoid
co_exit_to	TokenNameIdentifier
(	TokenNameLPAREN
Object	TokenNameIdentifier
arg_object	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
thisCoroutine	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
toCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
NoSuchMethodException	TokenNameIdentifier
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
!	TokenNameNOT
m_activeIDs	TokenNameIdentifier
.	TokenNameDOT
get	TokenNameIdentifier
(	TokenNameLPAREN
toCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
java	TokenNameIdentifier
.	TokenNameDOT
lang	TokenNameIdentifier
.	TokenNameDOT
NoSuchMethodException	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessages	TokenNameIdentifier
.	TokenNameDOT
createXMLMessage	TokenNameIdentifier
(	TokenNameLPAREN
XMLErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_COROUTINE_NOT_AVAIL	TokenNameIdentifier
,	TokenNameCOMMA
new	TokenNamenew
Object	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
{	TokenNameLBRACE
Integer	TokenNameIdentifier
.	TokenNameDOT
toString	TokenNameIdentifier
(	TokenNameLPAREN
toCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_yield	TokenNameIdentifier
=	TokenNameEQUAL
arg_object	TokenNameIdentifier
;	TokenNameSEMICOLON
m_nextCoroutine	TokenNameIdentifier
=	TokenNameEQUAL
toCoroutine	TokenNameIdentifier
;	TokenNameSEMICOLON
m_activeIDs	TokenNameIdentifier
.	TokenNameDOT
clear	TokenNameIdentifier
(	TokenNameLPAREN
thisCoroutine	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
notify	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE