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
final	TokenNamefinal
class	TokenNameclass
ChunkedIntArray	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
slotsize	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
lowbits	TokenNameIdentifier
=	TokenNameEQUAL
10	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
chunkalloc	TokenNameIdentifier
=	TokenNameEQUAL
1	TokenNameIntegerLiteral
<<	TokenNameLEFT_SHIFT
lowbits	TokenNameIdentifier
;	TokenNameSEMICOLON
static	TokenNamestatic
final	TokenNamefinal
int	TokenNameint
lowmask	TokenNameIdentifier
=	TokenNameEQUAL
chunkalloc	TokenNameIdentifier
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
ChunksVector	TokenNameIdentifier
chunks	TokenNameIdentifier
=	TokenNameEQUAL
new	TokenNamenew
ChunksVector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
final	TokenNamefinal
int	TokenNameint
fastArray	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
chunkalloc	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
lastUsed	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
ChunkedIntArray	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
slotsize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
slotsize	TokenNameIdentifier
<	TokenNameLESS
slotsize	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ArrayIndexOutOfBoundsException	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessages	TokenNameIdentifier
.	TokenNameDOT
createXMLMessage	TokenNameIdentifier
(	TokenNameLPAREN
XMLErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_CHUNKEDINTARRAY_NOT_SUPPORTED	TokenNameIdentifier
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
slotsize	TokenNameIdentifier
)	TokenNameRPAREN
}	TokenNameRBRACE
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
else	TokenNameelse
if	TokenNameif
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
slotsize	TokenNameIdentifier
>	TokenNameGREATER
slotsize	TokenNameIdentifier
)	TokenNameRPAREN
System	TokenNameIdentifier
.	TokenNameDOT
out	TokenNameIdentifier
.	TokenNameDOT
println	TokenNameIdentifier
(	TokenNameLPAREN
"*****WARNING: ChunkedIntArray("	TokenNameStringLiteral
+	TokenNamePLUS
slotsize	TokenNameIdentifier
+	TokenNamePLUS
") wasting "	TokenNameStringLiteral
+	TokenNamePLUS
(	TokenNameLPAREN
this	TokenNamethis
.	TokenNameDOT
slotsize	TokenNameIdentifier
-	TokenNameMINUS
slotsize	TokenNameIdentifier
)	TokenNameRPAREN
+	TokenNamePLUS
" words per slot"	TokenNameStringLiteral
)	TokenNameRPAREN
;	TokenNameSEMICOLON
chunks	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
fastArray	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
appendSlot	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
w0	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
w1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
w2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
w3	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
slotsize	TokenNameIdentifier
=	TokenNameEQUAL
4	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
newoffset	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
lastUsed	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
*	TokenNameMULTIPLY
slotsize	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
chunkpos	TokenNameIdentifier
=	TokenNameEQUAL
newoffset	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
lowbits	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
slotpos	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
newoffset	TokenNameIdentifier
&	TokenNameAND
lowmask	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
chunkpos	TokenNameIdentifier
>	TokenNameGREATER
chunks	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
chunks	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
chunkalloc	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chunk	TokenNameIdentifier
=	TokenNameEQUAL
chunks	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
chunkpos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
w0	TokenNameIdentifier
;	TokenNameSEMICOLON
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
w1	TokenNameIdentifier
;	TokenNameSEMICOLON
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
w2	TokenNameIdentifier
;	TokenNameSEMICOLON
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
+	TokenNamePLUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
w3	TokenNameIdentifier
;	TokenNameSEMICOLON
return	TokenNamereturn
++	TokenNamePLUS_PLUS
lastUsed	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
readEntry	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
position	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ArrayIndexOutOfBoundsException	TokenNameIdentifier
{	TokenNameLBRACE
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
offset	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
slotsize	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ArrayIndexOutOfBoundsException	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessages	TokenNameIdentifier
.	TokenNameDOT
createXMLMessage	TokenNameIdentifier
(	TokenNameLPAREN
XMLErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_OFFSET_BIGGER_THAN_SLOT	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
position	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
slotsize	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
chunkpos	TokenNameIdentifier
=	TokenNameEQUAL
position	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
lowbits	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
slotpos	TokenNameIdentifier
=	TokenNameEQUAL
position	TokenNameIdentifier
&	TokenNameAND
lowmask	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chunk	TokenNameIdentifier
=	TokenNameEQUAL
chunks	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
chunkpos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
return	TokenNamereturn
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
+	TokenNamePLUS
offset	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
int	TokenNameint
specialFind	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
startPos	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
position	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
ancestor	TokenNameIdentifier
=	TokenNameEQUAL
startPos	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
ancestor	TokenNameIdentifier
>	TokenNameGREATER
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
ancestor	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
slotsize	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
chunkpos	TokenNameIdentifier
=	TokenNameEQUAL
ancestor	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
lowbits	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
slotpos	TokenNameIdentifier
=	TokenNameEQUAL
ancestor	TokenNameIdentifier
&	TokenNameAND
lowmask	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chunk	TokenNameIdentifier
=	TokenNameEQUAL
chunks	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
chunkpos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
ancestor	TokenNameIdentifier
=	TokenNameEQUAL
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
ancestor	TokenNameIdentifier
==	TokenNameEQUAL_EQUAL
position	TokenNameIdentifier
)	TokenNameRPAREN
break	TokenNamebreak
;	TokenNameSEMICOLON
}	TokenNameRBRACE
if	TokenNameif
(	TokenNameLPAREN
ancestor	TokenNameIdentifier
<=	TokenNameLESS_EQUAL
0	TokenNameIntegerLiteral
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
position	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
return	TokenNamereturn
-	TokenNameMINUS
1	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
}	TokenNameRBRACE
int	TokenNameint
slotsUsed	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
lastUsed	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
discardLast	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
--	TokenNameMINUS_MINUS
lastUsed	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
writeEntry	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
position	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
offset	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
value	TokenNameIdentifier
)	TokenNameRPAREN
throws	TokenNamethrows
ArrayIndexOutOfBoundsException	TokenNameIdentifier
{	TokenNameLBRACE
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
offset	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
slotsize	TokenNameIdentifier
)	TokenNameRPAREN
throw	TokenNamethrow
new	TokenNamenew
ArrayIndexOutOfBoundsException	TokenNameIdentifier
(	TokenNameLPAREN
XMLMessages	TokenNameIdentifier
.	TokenNameDOT
createXMLMessage	TokenNameIdentifier
(	TokenNameLPAREN
XMLErrorResources	TokenNameIdentifier
.	TokenNameDOT
ER_OFFSET_BIGGER_THAN_SLOT	TokenNameIdentifier
,	TokenNameCOMMA
null	TokenNamenull
)	TokenNameRPAREN
)	TokenNameRPAREN
;	TokenNameSEMICOLON
position	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
slotsize	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
chunkpos	TokenNameIdentifier
=	TokenNameEQUAL
position	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
lowbits	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
slotpos	TokenNameIdentifier
=	TokenNameEQUAL
position	TokenNameIdentifier
&	TokenNameAND
lowmask	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chunk	TokenNameIdentifier
=	TokenNameEQUAL
chunks	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
chunkpos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
+	TokenNamePLUS
offset	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
void	TokenNamevoid
writeSlot	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
position	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
w0	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
w1	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
w2	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
w3	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
position	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
slotsize	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
chunkpos	TokenNameIdentifier
=	TokenNameEQUAL
position	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
lowbits	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
slotpos	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
position	TokenNameIdentifier
&	TokenNameAND
lowmask	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
chunkpos	TokenNameIdentifier
>	TokenNameGREATER
chunks	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
chunks	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
chunkalloc	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chunk	TokenNameIdentifier
=	TokenNameEQUAL
chunks	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
chunkpos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
w0	TokenNameIdentifier
;	TokenNameSEMICOLON
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
+	TokenNamePLUS
1	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
w1	TokenNameIdentifier
;	TokenNameSEMICOLON
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
+	TokenNamePLUS
2	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
w2	TokenNameIdentifier
;	TokenNameSEMICOLON
chunk	TokenNameIdentifier
[	TokenNameLBRACKET
slotpos	TokenNameIdentifier
+	TokenNamePLUS
3	TokenNameIntegerLiteral
]	TokenNameRBRACKET
=	TokenNameEQUAL
w3	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
readSlot	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
position	TokenNameIdentifier
,	TokenNameCOMMA
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
buffer	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
{	TokenNameLBRACE
position	TokenNameIdentifier
*=	TokenNameMULTIPLY_EQUAL
slotsize	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
chunkpos	TokenNameIdentifier
=	TokenNameEQUAL
position	TokenNameIdentifier
>>	TokenNameRIGHT_SHIFT
lowbits	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
slotpos	TokenNameIdentifier
=	TokenNameEQUAL
(	TokenNameLPAREN
position	TokenNameIdentifier
&	TokenNameAND
lowmask	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
if	TokenNameif
(	TokenNameLPAREN
chunkpos	TokenNameIdentifier
>	TokenNameGREATER
chunks	TokenNameIdentifier
.	TokenNameDOT
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
-	TokenNameMINUS
1	TokenNameIntegerLiteral
)	TokenNameRPAREN
chunks	TokenNameIdentifier
.	TokenNameDOT
addElement	TokenNameIdentifier
(	TokenNameLPAREN
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
chunkalloc	TokenNameIdentifier
]	TokenNameRBRACKET
)	TokenNameRPAREN
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
chunk	TokenNameIdentifier
=	TokenNameEQUAL
chunks	TokenNameIdentifier
.	TokenNameDOT
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
chunkpos	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
chunk	TokenNameIdentifier
,	TokenNameCOMMA
slotpos	TokenNameIdentifier
,	TokenNameCOMMA
buffer	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
slotsize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
class	TokenNameclass
ChunksVector	TokenNameIdentifier
{	TokenNameLBRACE
final	TokenNamefinal
int	TokenNameint
BLOCKSIZE	TokenNameIdentifier
=	TokenNameEQUAL
64	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
BLOCKSIZE	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
int	TokenNameint
m_mapSize	TokenNameIdentifier
=	TokenNameEQUAL
BLOCKSIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
pos	TokenNameIdentifier
=	TokenNameEQUAL
0	TokenNameIntegerLiteral
;	TokenNameSEMICOLON
ChunksVector	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
size	TokenNameIdentifier
(	TokenNameLPAREN
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
pos	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
void	TokenNamevoid
addElement	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
value	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
if	TokenNameif
(	TokenNameLPAREN
pos	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_mapSize	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
int	TokenNameint
orgMapSize	TokenNameIdentifier
=	TokenNameEQUAL
m_mapSize	TokenNameIdentifier
;	TokenNameSEMICOLON
while	TokenNamewhile
(	TokenNameLPAREN
pos	TokenNameIdentifier
>=	TokenNameGREATER_EQUAL
m_mapSize	TokenNameIdentifier
)	TokenNameRPAREN
m_mapSize	TokenNameIdentifier
+=	TokenNamePLUS_EQUAL
BLOCKSIZE	TokenNameIdentifier
;	TokenNameSEMICOLON
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
newMap	TokenNameIdentifier
[	TokenNameLBRACKET
]	TokenNameRBRACKET
=	TokenNameEQUAL
new	TokenNamenew
int	TokenNameint
[	TokenNameLBRACKET
m_mapSize	TokenNameIdentifier
]	TokenNameRBRACKET
[	TokenNameLBRACKET
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
System	TokenNameIdentifier
.	TokenNameDOT
arraycopy	TokenNameIdentifier
(	TokenNameLPAREN
m_map	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
newMap	TokenNameIdentifier
,	TokenNameCOMMA
0	TokenNameIntegerLiteral
,	TokenNameCOMMA
orgMapSize	TokenNameIdentifier
)	TokenNameRPAREN
;	TokenNameSEMICOLON
m_map	TokenNameIdentifier
=	TokenNameEQUAL
newMap	TokenNameIdentifier
;	TokenNameSEMICOLON
}	TokenNameRBRACE
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
pos	TokenNameIdentifier
]	TokenNameRBRACKET
=	TokenNameEQUAL
value	TokenNameIdentifier
;	TokenNameSEMICOLON
pos	TokenNameIdentifier
++	TokenNamePLUS_PLUS
;	TokenNameSEMICOLON
}	TokenNameRBRACE
final	TokenNamefinal
int	TokenNameint
[	TokenNameLBRACKET
]	TokenNameRBRACKET
elementAt	TokenNameIdentifier
(	TokenNameLPAREN
int	TokenNameint
pos	TokenNameIdentifier
)	TokenNameRPAREN
{	TokenNameLBRACE
return	TokenNamereturn
m_map	TokenNameIdentifier
[	TokenNameLBRACKET
pos	TokenNameIdentifier
]	TokenNameRBRACKET
;	TokenNameSEMICOLON
}	TokenNameRBRACE
}	TokenNameRBRACE
}	TokenNameRBRACE
